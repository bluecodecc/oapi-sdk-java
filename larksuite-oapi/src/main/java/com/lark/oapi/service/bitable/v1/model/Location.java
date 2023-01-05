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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class Location {
    /**
     * 经纬度
     * <p> 示例值：113.946927,22.529146
     */
    @SerializedName("location")
    private String location;
    /**
     * 省
     * <p> 示例值：广东省
     */
    @SerializedName("pname")
    private String pname;
    /**
     * 市
     * <p> 示例值：深圳市
     */
    @SerializedName("cityname")
    private String cityname;
    /**
     * 区
     * <p> 示例值：南山区
     */
    @SerializedName("adname")
    private String adname;
    /**
     * 详细地址
     * <p> 示例值：深圳湾创新科技中心(科苑地铁站C口步行340米)
     */
    @SerializedName("address")
    private String address;
    /**
     * 地名
     * <p> 示例值：字节跳动
     */
    @SerializedName("name")
    private String name;
    /**
     * 完整地址
     * <p> 示例值：字节跳动，广东省深圳市南山区深圳湾创新科技中心(科苑地铁站C口步行340米)
     */
    @SerializedName("full_address")
    private String fullAddress;

    // builder 开始
    public Location() {
    }

    public Location(Builder builder) {
        /**
         * 经纬度
         * <p> 示例值：113.946927,22.529146
         */
        this.location = builder.location;
        /**
         * 省
         * <p> 示例值：广东省
         */
        this.pname = builder.pname;
        /**
         * 市
         * <p> 示例值：深圳市
         */
        this.cityname = builder.cityname;
        /**
         * 区
         * <p> 示例值：南山区
         */
        this.adname = builder.adname;
        /**
         * 详细地址
         * <p> 示例值：深圳湾创新科技中心(科苑地铁站C口步行340米)
         */
        this.address = builder.address;
        /**
         * 地名
         * <p> 示例值：字节跳动
         */
        this.name = builder.name;
        /**
         * 完整地址
         * <p> 示例值：字节跳动，广东省深圳市南山区深圳湾创新科技中心(科苑地铁站C口步行340米)
         */
        this.fullAddress = builder.fullAddress;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPname() {
        return this.pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCityname() {
        return this.cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getAdname() {
        return this.adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullAddress() {
        return this.fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public static class Builder {
        /**
         * 经纬度
         * <p> 示例值：113.946927,22.529146
         */
        private String location;
        /**
         * 省
         * <p> 示例值：广东省
         */
        private String pname;
        /**
         * 市
         * <p> 示例值：深圳市
         */
        private String cityname;
        /**
         * 区
         * <p> 示例值：南山区
         */
        private String adname;
        /**
         * 详细地址
         * <p> 示例值：深圳湾创新科技中心(科苑地铁站C口步行340米)
         */
        private String address;
        /**
         * 地名
         * <p> 示例值：字节跳动
         */
        private String name;
        /**
         * 完整地址
         * <p> 示例值：字节跳动，广东省深圳市南山区深圳湾创新科技中心(科苑地铁站C口步行340米)
         */
        private String fullAddress;

        /**
         * 经纬度
         * <p> 示例值：113.946927,22.529146
         *
         * @param location
         * @return
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }


        /**
         * 省
         * <p> 示例值：广东省
         *
         * @param pname
         * @return
         */
        public Builder pname(String pname) {
            this.pname = pname;
            return this;
        }


        /**
         * 市
         * <p> 示例值：深圳市
         *
         * @param cityname
         * @return
         */
        public Builder cityname(String cityname) {
            this.cityname = cityname;
            return this;
        }


        /**
         * 区
         * <p> 示例值：南山区
         *
         * @param adname
         * @return
         */
        public Builder adname(String adname) {
            this.adname = adname;
            return this;
        }


        /**
         * 详细地址
         * <p> 示例值：深圳湾创新科技中心(科苑地铁站C口步行340米)
         *
         * @param address
         * @return
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }


        /**
         * 地名
         * <p> 示例值：字节跳动
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 完整地址
         * <p> 示例值：字节跳动，广东省深圳市南山区深圳湾创新科技中心(科苑地铁站C口步行340米)
         *
         * @param fullAddress
         * @return
         */
        public Builder fullAddress(String fullAddress) {
            this.fullAddress = fullAddress;
            return this;
        }


        public Location build() {
            return new Location(this);
        }
    }
}
