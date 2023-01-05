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

package com.lark.oapi.service.speech_to_text.v1.model;

import com.google.gson.annotations.SerializedName;

public class StreamRecognizeSpeechReqBody {
    /**
     * 语音资源
     * <p> 示例值：
     */
    @SerializedName("speech")
    private Speech speech;
    /**
     * 配置属性
     * <p> 示例值：
     */
    @SerializedName("config")
    private StreamConfig config;

    // builder 开始
    public StreamRecognizeSpeechReqBody() {
    }

    public StreamRecognizeSpeechReqBody(Builder builder) {
        /**
         * 语音资源
         * <p> 示例值：
         */
        this.speech = builder.speech;
        /**
         * 配置属性
         * <p> 示例值：
         */
        this.config = builder.config;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Speech getSpeech() {
        return this.speech;
    }

    public void setSpeech(Speech speech) {
        this.speech = speech;
    }

    public StreamConfig getConfig() {
        return this.config;
    }

    public void setConfig(StreamConfig config) {
        this.config = config;
    }

    public static class Builder {
        /**
         * 语音资源
         * <p> 示例值：
         */
        private Speech speech;
        /**
         * 配置属性
         * <p> 示例值：
         */
        private StreamConfig config;

        /**
         * 语音资源
         * <p> 示例值：
         *
         * @param speech
         * @return
         */
        public Builder speech(Speech speech) {
            this.speech = speech;
            return this;
        }


        /**
         * 配置属性
         * <p> 示例值：
         *
         * @param config
         * @return
         */
        public Builder config(StreamConfig config) {
            this.config = config;
            return this;
        }


        public StreamRecognizeSpeechReqBody build() {
            return new StreamRecognizeSpeechReqBody(this);
        }
    }
}
