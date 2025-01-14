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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ExternalApproval {
    /**
     * 审批定义名称，创建审批定义返回的值，表示该实例属于哪个流程；该字段会影响到列表中该实例的标题，标题取自对应定义的 name 字段。
     * <p> 示例值：@i18n@1
     */
    @SerializedName("approval_name")
    private String approvalName;
    /**
     * 审批定义 code，用户自定义，定义的唯一标识，如果不存在该 code，则创建，否则更新
     * <p> 示例值：permission_test
     */
    @SerializedName("approval_code")
    private String approvalCode;
    /**
     * 审批定义所属审批分组，用户自定义； 如果group_code当前不存在，则会新建审批分组； 如果group_code已经存在，则会使用group_name更新审批分组名称
     * <p> 示例值：work_group
     */
    @SerializedName("group_code")
    private String groupCode;
    /**
     * 分组名称，值的格式是 i18n key，文案放在 i18n_resource； 如果是 group_code 当前不存在，则该 group_name 必填，否则，如果填写了则会更新分组名称，不填则不更新分组名称； 审批发起页 审批定义的分组名称来自该字段
     * <p> 示例值：@i18n@2
     */
    @SerializedName("group_name")
    private String groupName;
    /**
     * 审批定义的说明，值的格式是 i18n key，文案放在 i18n_resource； 审批发起页 审批定义的说明内容来自该字段
     * <p> 示例值：@i18n@2
     */
    @SerializedName("description")
    private String description;
    /**
     * 三方审批相关
     * <p> 示例值：
     */
    @SerializedName("external")
    private ApprovalCreateExternal external;
    /**
     * 可见人列表，可通知配置多个可见人，只有在配置的范围内用户可以在审批发起也看到该审批，默认不传，则是任何人不可见
     * <p> 示例值：
     */
    @SerializedName("viewers")
    private ApprovalCreateViewers[] viewers;
    /**
     * 国际化文案
     * <p> 示例值：
     */
    @SerializedName("i18n_resources")
    private I18nResource[] i18nResources;
    /**
     * 根据user_id_type填写流程管理员id
     * <p> 示例值：19a294c2
     */
    @SerializedName("managers")
    private String[] managers;

    // builder 开始
    public ExternalApproval() {
    }

    public ExternalApproval(Builder builder) {
        /**
         * 审批定义名称，创建审批定义返回的值，表示该实例属于哪个流程；该字段会影响到列表中该实例的标题，标题取自对应定义的 name 字段。
         * <p> 示例值：@i18n@1
         */
        this.approvalName = builder.approvalName;
        /**
         * 审批定义 code，用户自定义，定义的唯一标识，如果不存在该 code，则创建，否则更新
         * <p> 示例值：permission_test
         */
        this.approvalCode = builder.approvalCode;
        /**
         * 审批定义所属审批分组，用户自定义； 如果group_code当前不存在，则会新建审批分组； 如果group_code已经存在，则会使用group_name更新审批分组名称
         * <p> 示例值：work_group
         */
        this.groupCode = builder.groupCode;
        /**
         * 分组名称，值的格式是 i18n key，文案放在 i18n_resource； 如果是 group_code 当前不存在，则该 group_name 必填，否则，如果填写了则会更新分组名称，不填则不更新分组名称； 审批发起页 审批定义的分组名称来自该字段
         * <p> 示例值：@i18n@2
         */
        this.groupName = builder.groupName;
        /**
         * 审批定义的说明，值的格式是 i18n key，文案放在 i18n_resource； 审批发起页 审批定义的说明内容来自该字段
         * <p> 示例值：@i18n@2
         */
        this.description = builder.description;
        /**
         * 三方审批相关
         * <p> 示例值：
         */
        this.external = builder.external;
        /**
         * 可见人列表，可通知配置多个可见人，只有在配置的范围内用户可以在审批发起也看到该审批，默认不传，则是任何人不可见
         * <p> 示例值：
         */
        this.viewers = builder.viewers;
        /**
         * 国际化文案
         * <p> 示例值：
         */
        this.i18nResources = builder.i18nResources;
        /**
         * 根据user_id_type填写流程管理员id
         * <p> 示例值：19a294c2
         */
        this.managers = builder.managers;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApprovalName() {
        return this.approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getGroupCode() {
        return this.groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApprovalCreateExternal getExternal() {
        return this.external;
    }

    public void setExternal(ApprovalCreateExternal external) {
        this.external = external;
    }

    public ApprovalCreateViewers[] getViewers() {
        return this.viewers;
    }

    public void setViewers(ApprovalCreateViewers[] viewers) {
        this.viewers = viewers;
    }

    public I18nResource[] getI18nResources() {
        return this.i18nResources;
    }

    public void setI18nResources(I18nResource[] i18nResources) {
        this.i18nResources = i18nResources;
    }

    public String[] getManagers() {
        return this.managers;
    }

    public void setManagers(String[] managers) {
        this.managers = managers;
    }

    public static class Builder {
        /**
         * 审批定义名称，创建审批定义返回的值，表示该实例属于哪个流程；该字段会影响到列表中该实例的标题，标题取自对应定义的 name 字段。
         * <p> 示例值：@i18n@1
         */
        private String approvalName;
        /**
         * 审批定义 code，用户自定义，定义的唯一标识，如果不存在该 code，则创建，否则更新
         * <p> 示例值：permission_test
         */
        private String approvalCode;
        /**
         * 审批定义所属审批分组，用户自定义； 如果group_code当前不存在，则会新建审批分组； 如果group_code已经存在，则会使用group_name更新审批分组名称
         * <p> 示例值：work_group
         */
        private String groupCode;
        /**
         * 分组名称，值的格式是 i18n key，文案放在 i18n_resource； 如果是 group_code 当前不存在，则该 group_name 必填，否则，如果填写了则会更新分组名称，不填则不更新分组名称； 审批发起页 审批定义的分组名称来自该字段
         * <p> 示例值：@i18n@2
         */
        private String groupName;
        /**
         * 审批定义的说明，值的格式是 i18n key，文案放在 i18n_resource； 审批发起页 审批定义的说明内容来自该字段
         * <p> 示例值：@i18n@2
         */
        private String description;
        /**
         * 三方审批相关
         * <p> 示例值：
         */
        private ApprovalCreateExternal external;
        /**
         * 可见人列表，可通知配置多个可见人，只有在配置的范围内用户可以在审批发起也看到该审批，默认不传，则是任何人不可见
         * <p> 示例值：
         */
        private ApprovalCreateViewers[] viewers;
        /**
         * 国际化文案
         * <p> 示例值：
         */
        private I18nResource[] i18nResources;
        /**
         * 根据user_id_type填写流程管理员id
         * <p> 示例值：19a294c2
         */
        private String[] managers;

        /**
         * 审批定义名称，创建审批定义返回的值，表示该实例属于哪个流程；该字段会影响到列表中该实例的标题，标题取自对应定义的 name 字段。
         * <p> 示例值：@i18n@1
         *
         * @param approvalName
         * @return
         */
        public Builder approvalName(String approvalName) {
            this.approvalName = approvalName;
            return this;
        }


        /**
         * 审批定义 code，用户自定义，定义的唯一标识，如果不存在该 code，则创建，否则更新
         * <p> 示例值：permission_test
         *
         * @param approvalCode
         * @return
         */
        public Builder approvalCode(String approvalCode) {
            this.approvalCode = approvalCode;
            return this;
        }


        /**
         * 审批定义所属审批分组，用户自定义； 如果group_code当前不存在，则会新建审批分组； 如果group_code已经存在，则会使用group_name更新审批分组名称
         * <p> 示例值：work_group
         *
         * @param groupCode
         * @return
         */
        public Builder groupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }


        /**
         * 分组名称，值的格式是 i18n key，文案放在 i18n_resource； 如果是 group_code 当前不存在，则该 group_name 必填，否则，如果填写了则会更新分组名称，不填则不更新分组名称； 审批发起页 审批定义的分组名称来自该字段
         * <p> 示例值：@i18n@2
         *
         * @param groupName
         * @return
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }


        /**
         * 审批定义的说明，值的格式是 i18n key，文案放在 i18n_resource； 审批发起页 审批定义的说明内容来自该字段
         * <p> 示例值：@i18n@2
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 三方审批相关
         * <p> 示例值：
         *
         * @param external
         * @return
         */
        public Builder external(ApprovalCreateExternal external) {
            this.external = external;
            return this;
        }


        /**
         * 可见人列表，可通知配置多个可见人，只有在配置的范围内用户可以在审批发起也看到该审批，默认不传，则是任何人不可见
         * <p> 示例值：
         *
         * @param viewers
         * @return
         */
        public Builder viewers(ApprovalCreateViewers[] viewers) {
            this.viewers = viewers;
            return this;
        }


        /**
         * 国际化文案
         * <p> 示例值：
         *
         * @param i18nResources
         * @return
         */
        public Builder i18nResources(I18nResource[] i18nResources) {
            this.i18nResources = i18nResources;
            return this;
        }


        /**
         * 根据user_id_type填写流程管理员id
         * <p> 示例值：19a294c2
         *
         * @param managers
         * @return
         */
        public Builder managers(String[] managers) {
            this.managers = managers;
            return this;
        }


        public ExternalApproval build() {
            return new ExternalApproval(this);
        }
    }
}
