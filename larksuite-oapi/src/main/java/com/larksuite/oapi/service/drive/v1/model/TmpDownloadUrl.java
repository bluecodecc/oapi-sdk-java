// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.google.gson.annotations.SerializedName;

public class TmpDownloadUrl {
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("tmp_download_url")
    private String tmpDownloadUrl;

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getTmpDownloadUrl() {
        return this.tmpDownloadUrl;
    }

    public void setTmpDownloadUrl(String tmpDownloadUrl) {
        this.tmpDownloadUrl = tmpDownloadUrl;
    }

}
