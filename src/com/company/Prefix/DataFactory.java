package com.company.Prefix;

public class DataFactory {

    public Data newData(Boolean in) {
        return new Data(in);
    }

    public Data newData(Integer in) {
        return new Data(in);
    }

    public Data newData(String variableName, PrefixParser.ExprContext functionBody) {
        return new Data(variableName, functionBody);
    }
}
