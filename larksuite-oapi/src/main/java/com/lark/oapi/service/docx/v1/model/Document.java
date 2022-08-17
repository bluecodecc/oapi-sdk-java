// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class Document {

  @SerializedName("document_id")
  private String documentId;
  @SerializedName("revision_id")
  private Integer revisionId;
  @SerializedName("title")
  private String title;

  // builder 开始
  public Document() {
  }

  public Document(Builder builder) {
    this.documentId = builder.documentId;
    this.revisionId = builder.revisionId;
    this.title = builder.title;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Integer getRevisionId() {
    return this.revisionId;
  }

  public void setRevisionId(Integer revisionId) {
    this.revisionId = revisionId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public static class Builder {

    private String documentId;
    private Integer revisionId;
    private String title;

    public Builder documentId(String documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder revisionId(Integer revisionId) {
      this.revisionId = revisionId;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }


    public Document build() {
      return new Document(this);
    }
  }
}