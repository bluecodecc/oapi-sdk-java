// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v2.model;
import com.google.gson.annotations.SerializedName;

public class ConditionFormatAttr {
    @SerializedName("operator")
    private String operator;
    @SerializedName("time_period")
    private String timePeriod;
    @SerializedName("formula")
    private String[] formula;
    @SerializedName("text")
    private String text;

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getTimePeriod() {
        return this.timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String[] getFormula() {
        return this.formula;
    }

    public void setFormula(String[] formula) {
        this.formula = formula;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
