// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v2.model;
import com.google.gson.annotations.SerializedName;

public class SpreadsheetsValuesBatchGetResult {
    @SerializedName("revision")
    private Integer revision;
    @SerializedName("spreadsheetToken")
    private String spreadsheetToken;
    @SerializedName("totalCells")
    private Integer totalCells;
    @SerializedName("valueRange")
    private ValueRange[] valueRange;

    public Integer getRevision() {
        return this.revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getSpreadsheetToken() {
        return this.spreadsheetToken;
    }

    public void setSpreadsheetToken(String spreadsheetToken) {
        this.spreadsheetToken = spreadsheetToken;
    }

    public Integer getTotalCells() {
        return this.totalCells;
    }

    public void setTotalCells(Integer totalCells) {
        this.totalCells = totalCells;
    }

    public ValueRange[] getValueRange() {
        return this.valueRange;
    }

    public void setValueRange(ValueRange[] valueRange) {
        this.valueRange = valueRange;
    }

}
