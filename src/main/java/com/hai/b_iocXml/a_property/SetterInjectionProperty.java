package com.hai.b_iocXml.a_property;

public class SetterInjectionProperty {
    private String property;

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "SetterInjectionProperty{" +
                "property='" + property + '\'' +
                '}';
    }
}
