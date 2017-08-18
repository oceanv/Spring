package com.hai.c_spel;

public class Operator {
    private double add;
    private double subtract;
    private double multiply;
    private double divide;
    private int mod;
    private double power;

    private String addStr;

    private boolean eq;
    private boolean lt;
    private boolean gt;
    private boolean le;
    private boolean ge;

    private boolean and;
    private boolean or;
    private boolean not;
    private boolean or2;    // ||

    private String ifElse;  // ? "value" : "value2"
    private String ifElse2;  // ?: "value"

    private boolean matches;    // 正则表达式

    public void setAdd(double add) {
        this.add = add;
    }

    public void setSubtract(double subtract) {
        this.subtract = subtract;
    }

    public void setMultiply(double multiply) {
        this.multiply = multiply;
    }

    public void setDivide(double divide) {
        this.divide = divide;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setAddStr(String addStr) {
        this.addStr = addStr;
    }

    public void setEq(boolean eq) {
        this.eq = eq;
    }

    public void setLt(boolean lt) {
        this.lt = lt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public void setLe(boolean le) {
        this.le = le;
    }

    public void setGe(boolean ge) {
        this.ge = ge;
    }

    public void setAnd(boolean and) {
        this.and = and;
    }

    public void setOr(boolean or) {
        this.or = or;
    }

    public void setNot(boolean not) {
        this.not = not;
    }

    public void setOr2(boolean or2) {
        this.or2 = or2;
    }

    public void setIfElse(String ifElse) {
        this.ifElse = ifElse;
    }

    public void setMatches(boolean matches) {
        this.matches = matches;
    }

    public void setIfElse2(String ifElse2) {
        this.ifElse2 = ifElse2;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "add=" + add +
                ", subtract=" + subtract +
                ", multiply=" + multiply +
                ", divide=" + divide +
                ", mod=" + mod +
                ", power=" + power +
                ", addStr='" + addStr + '\'' +
                ", eq=" + eq +
                ", lt=" + lt +
                ", gt=" + gt +
                ", le=" + le +
                ", ge=" + ge +
                ", and=" + and +
                ", or=" + or +
                ", not=" + not +
                ", or2=" + or2 +
                ", ifElse='" + ifElse + '\'' +
                ", ifElse2='" + ifElse2 + '\'' +
                ", matches=" + matches +
                '}';
    }
}
