// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v2.model;
import com.google.gson.annotations.SerializedName;

public class SpreadsheetsDataValidationUpdateResult {
    @SerializedName("spreadsheetToken")
    private String spreadsheetToken;
    @SerializedName("sheetId")
    private String sheetId;
    @SerializedName("dataValidation")
    private DataValidationResponse dataValidation;

    public String getSpreadsheetToken() {
        return this.spreadsheetToken;
    }

    public void setSpreadsheetToken(String spreadsheetToken) {
        this.spreadsheetToken = spreadsheetToken;
    }

    public String getSheetId() {
        return this.sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public DataValidationResponse getDataValidation() {
        return this.dataValidation;
    }

    public void setDataValidation(DataValidationResponse dataValidation) {
        this.dataValidation = dataValidation;
    }

}
