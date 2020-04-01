package com.company.Prefix;

public class Data {
    private Boolean boolData;
    private Integer intData;

    public Data(Boolean in) {
        boolData = in;
    }

    public Data(Integer in) {
        intData = in;
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

    public String toString() {
       if (getBoolData() != null)
           return getBoolData().toString();
       else
           return getIntData().toString();
    }
}
