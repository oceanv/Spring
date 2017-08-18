package com.hai.b_iocXml.a_property;

public class ConstructorInjectionProperty {
    private String property;
    private int intVal;
    private double doubleVal;

    public ConstructorInjectionProperty(String property) {
        this.property = property;
    }


    public ConstructorInjectionProperty(String property, int intVal) {
        this.property = property;
        this.intVal = intVal;
    }


    public ConstructorInjectionProperty(String property, double doubleVal) {
        this.property = property;
        this.doubleVal = doubleVal;
    }

    @Override
    public String toString() {
        return "ConstructorInjectionProperty{" +
                "property='" + property + '\'' +
                ", intVal=" + intVal +
                ", doubleVal=" + doubleVal +
                '}';
    }
}
