package com.company.Prefix;

public class Data {
    private Boolean boolData;
    private Integer intData;

    private String variableName;
    private PrefixParser.ExprContext functionBody;

    public Data(Boolean in) {
        boolData = in;
    }

    public Data(Integer in) {
        intData = in;
    }

    public Data(String variableName, PrefixParser.ExprContext functionBody) {
        this.variableName = variableName;
        this.functionBody = functionBody;
    }

    public Boolean getBoolData() {
        return boolData;
    }

    public void setBoolData(Boolean boolData) {
        this.boolData = boolData;
    }

    public Integer getIntData() {
        return intData;
    }

    public void setIntData(Integer intData) {
        this.intData = intData;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public PrefixParser.ExprContext getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(PrefixParser.ExprContext functionBody) {
        this.functionBody = functionBody;
    }

    public String toString() {
        if (getBoolData() != null)
            return getBoolData().toString();
        else if(getIntData() != null)
            return getIntData().toString();
        else if(getVariableName() != null){
            return "Variable for function is named " + getVariableName() + " body is " + getFunctionBody();
        }
        return null;
    }
}
