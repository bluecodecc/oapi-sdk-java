// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.google.gson.annotations.SerializedName;

public class ReplyElement {
    @SerializedName("type")
    private String type;
    @SerializedName("text_run")
    private TextRun textRun;
    @SerializedName("docs_link")
    private DocsLink docsLink;
    @SerializedName("person")
    private Person person;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TextRun getTextRun() {
        return this.textRun;
    }

    public void setTextRun(TextRun textRun) {
        this.textRun = textRun;
    }

    public DocsLink getDocsLink() {
        return this.docsLink;
    }

    public void setDocsLink(DocsLink docsLink) {
        this.docsLink = docsLink;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
