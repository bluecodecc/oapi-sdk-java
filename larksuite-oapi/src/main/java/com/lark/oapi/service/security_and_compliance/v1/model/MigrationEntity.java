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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.google.gson.annotations.SerializedName;

public class MigrationEntity {
    /**
     * 迁移的实体 id
     * <p> 示例值：43c58071254443c580712544
     */
    @SerializedName("id")
    private String id;
    /**
     * 实体的数据驻留地
     * <p> 示例值：SG
     */
    @SerializedName("location")
    private String location;
    /**
     * 实体的类型
     * <p> 示例值：sheets
     */
    @SerializedName("type")
    private String type;
    /**
     * 创建者的 id
     * <p> 示例值：4443c580712544
     */
    @SerializedName("creator_id")
    private String creatorId;
    /**
     * 创建者的类型
     * <p> 示例值：user
     */
    @SerializedName("creator_type")
    private String creatorType;
    /**
     * 实体创建时间（毫秒级时间戳）
     * <p> 示例值：1615380573411
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
     * <p> 示例值：xxx@xxx.xx
     */
    @SerializedName("mail_address")
    private String mailAddress;

    // builder 开始
    public MigrationEntity() {
    }

    public MigrationEntity(Builder builder) {
        /**
         * 迁移的实体 id
         * <p> 示例值：43c58071254443c580712544
         */
        this.id = builder.id;
        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         */
        this.location = builder.location;
        /**
         * 实体的类型
         * <p> 示例值：sheets
         */
        this.type = builder.type;
        /**
         * 创建者的 id
         * <p> 示例值：4443c580712544
         */
        this.creatorId = builder.creatorId;
        /**
         * 创建者的类型
         * <p> 示例值：user
         */
        this.creatorType = builder.creatorType;
        /**
         * 实体创建时间（毫秒级时间戳）
         * <p> 示例值：1615380573411
         */
        this.createTime = builder.createTime;
        /**
         * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
         * <p> 示例值：xxx@xxx.xx
         */
        this.mailAddress = builder.mailAddress;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorType() {
        return this.creatorType;
    }

    public void setCreatorType(String creatorType) {
        this.creatorType = creatorType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public static class Builder {
        /**
         * 迁移的实体 id
         * <p> 示例值：43c58071254443c580712544
         */
        private String id;
        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         */
        private String location;
        /**
         * 实体的类型
         * <p> 示例值：sheets
         */
        private String type;
        /**
         * 创建者的 id
         * <p> 示例值：4443c580712544
         */
        private String creatorId;
        /**
         * 创建者的类型
         * <p> 示例值：user
         */
        private String creatorType;
        /**
         * 实体创建时间（毫秒级时间戳）
         * <p> 示例值：1615380573411
         */
        private String createTime;
        /**
         * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
         * <p> 示例值：xxx@xxx.xx
         */
        private String mailAddress;

        /**
         * 迁移的实体 id
         * <p> 示例值：43c58071254443c580712544
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         *
         * @param location
         * @return
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         *
         * @param location {@link com.lark.oapi.service.security_and_compliance.v1.enums.MigrationEntityLocationEnum}
         * @return
         */
        public Builder location(com.lark.oapi.service.security_and_compliance.v1.enums.MigrationEntityLocationEnum location) {
            this.location = location.getValue();
            return this;
        }


        /**
         * 实体的类型
         * <p> 示例值：sheets
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 实体的类型
         * <p> 示例值：sheets
         *
         * @param type {@link com.lark.oapi.service.security_and_compliance.v1.enums.MigrationEntityTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.security_and_compliance.v1.enums.MigrationEntityTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 创建者的 id
         * <p> 示例值：4443c580712544
         *
         * @param creatorId
         * @return
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }


        /**
         * 创建者的类型
         * <p> 示例值：user
         *
         * @param creatorType
         * @return
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * 创建者的类型
         * <p> 示例值：user
         *
         * @param creatorType {@link com.lark.oapi.service.security_and_compliance.v1.enums.MigrationEntityCreatorTypeEnum}
         * @return
         */
        public Builder creatorType(com.lark.oapi.service.security_and_compliance.v1.enums.MigrationEntityCreatorTypeEnum creatorType) {
            this.creatorType = creatorType.getValue();
            return this;
        }


        /**
         * 实体创建时间（毫秒级时间戳）
         * <p> 示例值：1615380573411
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
         * <p> 示例值：xxx@xxx.xx
         *
         * @param mailAddress
         * @return
         */
        public Builder mailAddress(String mailAddress) {
            this.mailAddress = mailAddress;
            return this;
        }


        public MigrationEntity build() {
            return new MigrationEntity(this);
        }
    }
}
