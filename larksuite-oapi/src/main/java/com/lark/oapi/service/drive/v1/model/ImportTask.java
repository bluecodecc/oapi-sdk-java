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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class ImportTask {
    /**
     * 任务ID
     * <p> 示例值：6990281865xxxxxxxx7843
     */
    @SerializedName("ticket")
    private String ticket;
    /**
     * 导入文件格式后缀
     * <p> 示例值：xlsx
     */
    @SerializedName("file_extension")
    private String fileExtension;
    /**
     * 导入文件Drive FileToken
     * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
     */
    @SerializedName("file_token")
    private String fileToken;
    /**
     * 导入目标云文档格式
     * <p> 示例值：sheet
     */
    @SerializedName("type")
    private String type;
    /**
     * 导入目标云文档文件名 ，若为空使用Drive文件名
     * <p> 示例值：test
     */
    @SerializedName("file_name")
    private String fileName;
    /**
     * 挂载点
     * <p> 示例值：
     */
    @SerializedName("point")
    private ImportTaskMountPoint point;
    /**
     * 任务状态
     * <p> 示例值：0
     */
    @SerializedName("job_status")
    private Integer jobStatus;
    /**
     * 任务失败原因
     * <p> 示例值：success
     */
    @SerializedName("job_error_msg")
    private String jobErrorMsg;
    /**
     * 导入云文档Token
     * <p> 示例值：shtcnVBTG6SuxxxxxxxkM2tUX
     */
    @SerializedName("token")
    private String token;
    /**
     * 导入云文档URL
     * <p> 示例值：https://bytedance.feishu.cn/sheets/shtcnVBTG6SuxxxxxxxkM2tUX
     */
    @SerializedName("url")
    private String url;
    /**
     * 任务成功后的提示信息
     * <p> 示例值：
     */
    @SerializedName("extra")
    private String[] extra;

    // builder 开始
    public ImportTask() {
    }

    public ImportTask(Builder builder) {
        /**
         * 任务ID
         * <p> 示例值：6990281865xxxxxxxx7843
         */
        this.ticket = builder.ticket;
        /**
         * 导入文件格式后缀
         * <p> 示例值：xlsx
         */
        this.fileExtension = builder.fileExtension;
        /**
         * 导入文件Drive FileToken
         * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
         */
        this.fileToken = builder.fileToken;
        /**
         * 导入目标云文档格式
         * <p> 示例值：sheet
         */
        this.type = builder.type;
        /**
         * 导入目标云文档文件名 ，若为空使用Drive文件名
         * <p> 示例值：test
         */
        this.fileName = builder.fileName;
        /**
         * 挂载点
         * <p> 示例值：
         */
        this.point = builder.point;
        /**
         * 任务状态
         * <p> 示例值：0
         */
        this.jobStatus = builder.jobStatus;
        /**
         * 任务失败原因
         * <p> 示例值：success
         */
        this.jobErrorMsg = builder.jobErrorMsg;
        /**
         * 导入云文档Token
         * <p> 示例值：shtcnVBTG6SuxxxxxxxkM2tUX
         */
        this.token = builder.token;
        /**
         * 导入云文档URL
         * <p> 示例值：https://bytedance.feishu.cn/sheets/shtcnVBTG6SuxxxxxxxkM2tUX
         */
        this.url = builder.url;
        /**
         * 任务成功后的提示信息
         * <p> 示例值：
         */
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTicket() {
        return this.ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getFileExtension() {
        return this.fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ImportTaskMountPoint getPoint() {
        return this.point;
    }

    public void setPoint(ImportTaskMountPoint point) {
        this.point = point;
    }

    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobErrorMsg() {
        return this.jobErrorMsg;
    }

    public void setJobErrorMsg(String jobErrorMsg) {
        this.jobErrorMsg = jobErrorMsg;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[] getExtra() {
        return this.extra;
    }

    public void setExtra(String[] extra) {
        this.extra = extra;
    }

    public static class Builder {
        /**
         * 任务ID
         * <p> 示例值：6990281865xxxxxxxx7843
         */
        private String ticket;
        /**
         * 导入文件格式后缀
         * <p> 示例值：xlsx
         */
        private String fileExtension;
        /**
         * 导入文件Drive FileToken
         * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
         */
        private String fileToken;
        /**
         * 导入目标云文档格式
         * <p> 示例值：sheet
         */
        private String type;
        /**
         * 导入目标云文档文件名 ，若为空使用Drive文件名
         * <p> 示例值：test
         */
        private String fileName;
        /**
         * 挂载点
         * <p> 示例值：
         */
        private ImportTaskMountPoint point;
        /**
         * 任务状态
         * <p> 示例值：0
         */
        private Integer jobStatus;
        /**
         * 任务失败原因
         * <p> 示例值：success
         */
        private String jobErrorMsg;
        /**
         * 导入云文档Token
         * <p> 示例值：shtcnVBTG6SuxxxxxxxkM2tUX
         */
        private String token;
        /**
         * 导入云文档URL
         * <p> 示例值：https://bytedance.feishu.cn/sheets/shtcnVBTG6SuxxxxxxxkM2tUX
         */
        private String url;
        /**
         * 任务成功后的提示信息
         * <p> 示例值：
         */
        private String[] extra;

        /**
         * 任务ID
         * <p> 示例值：6990281865xxxxxxxx7843
         *
         * @param ticket
         * @return
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }


        /**
         * 导入文件格式后缀
         * <p> 示例值：xlsx
         *
         * @param fileExtension
         * @return
         */
        public Builder fileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            return this;
        }


        /**
         * 导入文件Drive FileToken
         * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }


        /**
         * 导入目标云文档格式
         * <p> 示例值：sheet
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 导入目标云文档文件名 ，若为空使用Drive文件名
         * <p> 示例值：test
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }


        /**
         * 挂载点
         * <p> 示例值：
         *
         * @param point
         * @return
         */
        public Builder point(ImportTaskMountPoint point) {
            this.point = point;
            return this;
        }


        /**
         * 任务状态
         * <p> 示例值：0
         *
         * @param jobStatus
         * @return
         */
        public Builder jobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * 任务状态
         * <p> 示例值：0
         *
         * @param jobStatus {@link com.lark.oapi.service.drive.v1.enums.ImportTaskJobStatusEnum}
         * @return
         */
        public Builder jobStatus(com.lark.oapi.service.drive.v1.enums.ImportTaskJobStatusEnum jobStatus) {
            this.jobStatus = jobStatus.getValue();
            return this;
        }


        /**
         * 任务失败原因
         * <p> 示例值：success
         *
         * @param jobErrorMsg
         * @return
         */
        public Builder jobErrorMsg(String jobErrorMsg) {
            this.jobErrorMsg = jobErrorMsg;
            return this;
        }


        /**
         * 导入云文档Token
         * <p> 示例值：shtcnVBTG6SuxxxxxxxkM2tUX
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }


        /**
         * 导入云文档URL
         * <p> 示例值：https://bytedance.feishu.cn/sheets/shtcnVBTG6SuxxxxxxxkM2tUX
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * 任务成功后的提示信息
         * <p> 示例值：
         *
         * @param extra
         * @return
         */
        public Builder extra(String[] extra) {
            this.extra = extra;
            return this;
        }


        public ImportTask build() {
            return new ImportTask(this);
        }
    }
}
