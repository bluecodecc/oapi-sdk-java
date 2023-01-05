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

package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;

public class RelatedMeta {
    /**
     * 相关联系人
     * <p> 示例值：
     */
    @SerializedName("users")
    private Referer[] users;
    /**
     * 相关服务中的相关公开群
     * <p> 示例值：
     */
    @SerializedName("chats")
    private Referer[] chats;
    /**
     * 相关云文档
     * <p> 示例值：
     */
    @SerializedName("docs")
    private Referer[] docs;
    /**
     * 相关服务中的相关值班号
     * <p> 示例值：
     */
    @SerializedName("oncalls")
    private Referer[] oncalls;
    /**
     * 相关链接
     * <p> 示例值：
     */
    @SerializedName("links")
    private Referer[] links;
    /**
     * 相关词条
     * <p> 示例值：
     */
    @SerializedName("abbreviations")
    private Abbreviation[] abbreviations;
    /**
     * 当前词条所属分类;词条只能属于二级分类，且每个一级分类下只能选择一个二级分类。
     * <p> 示例值：
     */
    @SerializedName("classifications")
    private Classification[] classifications;
    /**
     * 上传的图片
     * <p> 示例值：
     */
    @SerializedName("images")
    private BaikeImage[] images;

    // builder 开始
    public RelatedMeta() {
    }

    public RelatedMeta(Builder builder) {
        /**
         * 相关联系人
         * <p> 示例值：
         */
        this.users = builder.users;
        /**
         * 相关服务中的相关公开群
         * <p> 示例值：
         */
        this.chats = builder.chats;
        /**
         * 相关云文档
         * <p> 示例值：
         */
        this.docs = builder.docs;
        /**
         * 相关服务中的相关值班号
         * <p> 示例值：
         */
        this.oncalls = builder.oncalls;
        /**
         * 相关链接
         * <p> 示例值：
         */
        this.links = builder.links;
        /**
         * 相关词条
         * <p> 示例值：
         */
        this.abbreviations = builder.abbreviations;
        /**
         * 当前词条所属分类;词条只能属于二级分类，且每个一级分类下只能选择一个二级分类。
         * <p> 示例值：
         */
        this.classifications = builder.classifications;
        /**
         * 上传的图片
         * <p> 示例值：
         */
        this.images = builder.images;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Referer[] getUsers() {
        return this.users;
    }

    public void setUsers(Referer[] users) {
        this.users = users;
    }

    public Referer[] getChats() {
        return this.chats;
    }

    public void setChats(Referer[] chats) {
        this.chats = chats;
    }

    public Referer[] getDocs() {
        return this.docs;
    }

    public void setDocs(Referer[] docs) {
        this.docs = docs;
    }

    public Referer[] getOncalls() {
        return this.oncalls;
    }

    public void setOncalls(Referer[] oncalls) {
        this.oncalls = oncalls;
    }

    public Referer[] getLinks() {
        return this.links;
    }

    public void setLinks(Referer[] links) {
        this.links = links;
    }

    public Abbreviation[] getAbbreviations() {
        return this.abbreviations;
    }

    public void setAbbreviations(Abbreviation[] abbreviations) {
        this.abbreviations = abbreviations;
    }

    public Classification[] getClassifications() {
        return this.classifications;
    }

    public void setClassifications(Classification[] classifications) {
        this.classifications = classifications;
    }

    public BaikeImage[] getImages() {
        return this.images;
    }

    public void setImages(BaikeImage[] images) {
        this.images = images;
    }

    public static class Builder {
        /**
         * 相关联系人
         * <p> 示例值：
         */
        private Referer[] users;
        /**
         * 相关服务中的相关公开群
         * <p> 示例值：
         */
        private Referer[] chats;
        /**
         * 相关云文档
         * <p> 示例值：
         */
        private Referer[] docs;
        /**
         * 相关服务中的相关值班号
         * <p> 示例值：
         */
        private Referer[] oncalls;
        /**
         * 相关链接
         * <p> 示例值：
         */
        private Referer[] links;
        /**
         * 相关词条
         * <p> 示例值：
         */
        private Abbreviation[] abbreviations;
        /**
         * 当前词条所属分类;词条只能属于二级分类，且每个一级分类下只能选择一个二级分类。
         * <p> 示例值：
         */
        private Classification[] classifications;
        /**
         * 上传的图片
         * <p> 示例值：
         */
        private BaikeImage[] images;

        /**
         * 相关联系人
         * <p> 示例值：
         *
         * @param users
         * @return
         */
        public Builder users(Referer[] users) {
            this.users = users;
            return this;
        }


        /**
         * 相关服务中的相关公开群
         * <p> 示例值：
         *
         * @param chats
         * @return
         */
        public Builder chats(Referer[] chats) {
            this.chats = chats;
            return this;
        }


        /**
         * 相关云文档
         * <p> 示例值：
         *
         * @param docs
         * @return
         */
        public Builder docs(Referer[] docs) {
            this.docs = docs;
            return this;
        }


        /**
         * 相关服务中的相关值班号
         * <p> 示例值：
         *
         * @param oncalls
         * @return
         */
        public Builder oncalls(Referer[] oncalls) {
            this.oncalls = oncalls;
            return this;
        }


        /**
         * 相关链接
         * <p> 示例值：
         *
         * @param links
         * @return
         */
        public Builder links(Referer[] links) {
            this.links = links;
            return this;
        }


        /**
         * 相关词条
         * <p> 示例值：
         *
         * @param abbreviations
         * @return
         */
        public Builder abbreviations(Abbreviation[] abbreviations) {
            this.abbreviations = abbreviations;
            return this;
        }


        /**
         * 当前词条所属分类;词条只能属于二级分类，且每个一级分类下只能选择一个二级分类。
         * <p> 示例值：
         *
         * @param classifications
         * @return
         */
        public Builder classifications(Classification[] classifications) {
            this.classifications = classifications;
            return this;
        }


        /**
         * 上传的图片
         * <p> 示例值：
         *
         * @param images
         * @return
         */
        public Builder images(BaikeImage[] images) {
            this.images = images;
            return this;
        }


        public RelatedMeta build() {
            return new RelatedMeta(this);
        }
    }
}
