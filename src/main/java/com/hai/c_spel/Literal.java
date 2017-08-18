package com.hai.c_spel;

public class Literal {
    int intVal;
    float floatVal;
    double doubleVal;
    String string;
    boolean boolVal;

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public float getFloatVal() {
        return floatVal;
    }

    public void setFloatVal(float floatVal) {
        this.floatVal = floatVal;
    }

    public double getDoubleVal() {
        return doubleVal;
    }

    public void setDoubleVal(double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean isBoolVal() {
        return boolVal;
    }

    public void setBoolVal(boolean boolVal) {
        this.boolVal = boolVal;
    }

    @Override
    public String toString() {
        return "Literal{" +
                "intVal=" + intVal +
                ", floatVal=" + floatVal +
                ", doubleVal=" + doubleVal +
                ", string='" + string + '\'' +
                ", boolVal=" + boolVal +
                '}';
    }
}
