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

public class UpdateBlockRequest {
    /**
     * 更新文本元素请求
     * <p> 示例值：
     */
    @SerializedName("update_text_elements")
    private UpdateTextElementsRequest updateTextElements;
    /**
     * 更新文本样式请求
     * <p> 示例值：
     */
    @SerializedName("update_text_style")
    private UpdateTextStyleRequest updateTextStyle;
    /**
     * 更新表格属性请求
     * <p> 示例值：
     */
    @SerializedName("update_table_property")
    private UpdateTablePropertyRequest updateTableProperty;
    /**
     * 表格插入新行请求
     * <p> 示例值：
     */
    @SerializedName("insert_table_row")
    private InsertTableRowRequest insertTableRow;
    /**
     * 表格插入新列请求
     * <p> 示例值：
     */
    @SerializedName("insert_table_column")
    private InsertTableColumnRequest insertTableColumn;
    /**
     * 表格批量删除行请求
     * <p> 示例值：
     */
    @SerializedName("delete_table_rows")
    private DeleteTableRowsRequest deleteTableRows;
    /**
     * 表格批量删除列请求
     * <p> 示例值：
     */
    @SerializedName("delete_table_columns")
    private DeleteTableColumnsRequest deleteTableColumns;
    /**
     * 表格合并单元格请求
     * <p> 示例值：
     */
    @SerializedName("merge_table_cells")
    private MergeTableCellsRequest mergeTableCells;
    /**
     * 表格取消单元格合并状态请求
     * <p> 示例值：
     */
    @SerializedName("unmerge_table_cells")
    private UnmergeTableCellsRequest unmergeTableCells;
    /**
     * 分栏插入新的分栏列请求
     * <p> 示例值：
     */
    @SerializedName("insert_grid_column")
    private InsertGridColumnRequest insertGridColumn;
    /**
     * 分栏删除列请求
     * <p> 示例值：
     */
    @SerializedName("delete_grid_column")
    private DeleteGridColumnRequest deleteGridColumn;
    /**
     * 更新分栏列宽比例请求
     * <p> 示例值：
     */
    @SerializedName("update_grid_column_width_ratio")
    private UpdateGridColumnWidthRatioRequest updateGridColumnWidthRatio;
    /**
     * 替换图片请求
     * <p> 示例值：
     */
    @SerializedName("replace_image")
    private ReplaceImageRequest replaceImage;
    /**
     * 替换附件请求
     * <p> 示例值：
     */
    @SerializedName("replace_file")
    private ReplaceFileRequest replaceFile;
    /**
     * Block 唯一标识
     * <p> 示例值：doxcnSS4ouQkQEouGSUkTg9NJPe
     */
    @SerializedName("block_id")
    private String blockId;
    /**
     * 更新文本元素及样式请求
     * <p> 示例值：
     */
    @SerializedName("update_text")
    private UpdateTextRequest updateText;
    /**
     * 更新任务 Block 请求
     * <p> 示例值：
     */
    @SerializedName("update_task")
    private UpdateTaskRequest updateTask;

    // builder 开始
    public UpdateBlockRequest() {
    }

    public UpdateBlockRequest(Builder builder) {
        /**
         * 更新文本元素请求
         * <p> 示例值：
         */
        this.updateTextElements = builder.updateTextElements;
        /**
         * 更新文本样式请求
         * <p> 示例值：
         */
        this.updateTextStyle = builder.updateTextStyle;
        /**
         * 更新表格属性请求
         * <p> 示例值：
         */
        this.updateTableProperty = builder.updateTableProperty;
        /**
         * 表格插入新行请求
         * <p> 示例值：
         */
        this.insertTableRow = builder.insertTableRow;
        /**
         * 表格插入新列请求
         * <p> 示例值：
         */
        this.insertTableColumn = builder.insertTableColumn;
        /**
         * 表格批量删除行请求
         * <p> 示例值：
         */
        this.deleteTableRows = builder.deleteTableRows;
        /**
         * 表格批量删除列请求
         * <p> 示例值：
         */
        this.deleteTableColumns = builder.deleteTableColumns;
        /**
         * 表格合并单元格请求
         * <p> 示例值：
         */
        this.mergeTableCells = builder.mergeTableCells;
        /**
         * 表格取消单元格合并状态请求
         * <p> 示例值：
         */
        this.unmergeTableCells = builder.unmergeTableCells;
        /**
         * 分栏插入新的分栏列请求
         * <p> 示例值：
         */
        this.insertGridColumn = builder.insertGridColumn;
        /**
         * 分栏删除列请求
         * <p> 示例值：
         */
        this.deleteGridColumn = builder.deleteGridColumn;
        /**
         * 更新分栏列宽比例请求
         * <p> 示例值：
         */
        this.updateGridColumnWidthRatio = builder.updateGridColumnWidthRatio;
        /**
         * 替换图片请求
         * <p> 示例值：
         */
        this.replaceImage = builder.replaceImage;
        /**
         * 替换附件请求
         * <p> 示例值：
         */
        this.replaceFile = builder.replaceFile;
        /**
         * Block 唯一标识
         * <p> 示例值：doxcnSS4ouQkQEouGSUkTg9NJPe
         */
        this.blockId = builder.blockId;
        /**
         * 更新文本元素及样式请求
         * <p> 示例值：
         */
        this.updateText = builder.updateText;
        /**
         * 更新任务 Block 请求
         * <p> 示例值：
         */
        this.updateTask = builder.updateTask;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UpdateTextElementsRequest getUpdateTextElements() {
        return this.updateTextElements;
    }

    public void setUpdateTextElements(UpdateTextElementsRequest updateTextElements) {
        this.updateTextElements = updateTextElements;
    }

    public UpdateTextStyleRequest getUpdateTextStyle() {
        return this.updateTextStyle;
    }

    public void setUpdateTextStyle(UpdateTextStyleRequest updateTextStyle) {
        this.updateTextStyle = updateTextStyle;
    }

    public UpdateTablePropertyRequest getUpdateTableProperty() {
        return this.updateTableProperty;
    }

    public void setUpdateTableProperty(UpdateTablePropertyRequest updateTableProperty) {
        this.updateTableProperty = updateTableProperty;
    }

    public InsertTableRowRequest getInsertTableRow() {
        return this.insertTableRow;
    }

    public void setInsertTableRow(InsertTableRowRequest insertTableRow) {
        this.insertTableRow = insertTableRow;
    }

    public InsertTableColumnRequest getInsertTableColumn() {
        return this.insertTableColumn;
    }

    public void setInsertTableColumn(InsertTableColumnRequest insertTableColumn) {
        this.insertTableColumn = insertTableColumn;
    }

    public DeleteTableRowsRequest getDeleteTableRows() {
        return this.deleteTableRows;
    }

    public void setDeleteTableRows(DeleteTableRowsRequest deleteTableRows) {
        this.deleteTableRows = deleteTableRows;
    }

    public DeleteTableColumnsRequest getDeleteTableColumns() {
        return this.deleteTableColumns;
    }

    public void setDeleteTableColumns(DeleteTableColumnsRequest deleteTableColumns) {
        this.deleteTableColumns = deleteTableColumns;
    }

    public MergeTableCellsRequest getMergeTableCells() {
        return this.mergeTableCells;
    }

    public void setMergeTableCells(MergeTableCellsRequest mergeTableCells) {
        this.mergeTableCells = mergeTableCells;
    }

    public UnmergeTableCellsRequest getUnmergeTableCells() {
        return this.unmergeTableCells;
    }

    public void setUnmergeTableCells(UnmergeTableCellsRequest unmergeTableCells) {
        this.unmergeTableCells = unmergeTableCells;
    }

    public InsertGridColumnRequest getInsertGridColumn() {
        return this.insertGridColumn;
    }

    public void setInsertGridColumn(InsertGridColumnRequest insertGridColumn) {
        this.insertGridColumn = insertGridColumn;
    }

    public DeleteGridColumnRequest getDeleteGridColumn() {
        return this.deleteGridColumn;
    }

    public void setDeleteGridColumn(DeleteGridColumnRequest deleteGridColumn) {
        this.deleteGridColumn = deleteGridColumn;
    }

    public UpdateGridColumnWidthRatioRequest getUpdateGridColumnWidthRatio() {
        return this.updateGridColumnWidthRatio;
    }

    public void setUpdateGridColumnWidthRatio(UpdateGridColumnWidthRatioRequest updateGridColumnWidthRatio) {
        this.updateGridColumnWidthRatio = updateGridColumnWidthRatio;
    }

    public ReplaceImageRequest getReplaceImage() {
        return this.replaceImage;
    }

    public void setReplaceImage(ReplaceImageRequest replaceImage) {
        this.replaceImage = replaceImage;
    }

    public ReplaceFileRequest getReplaceFile() {
        return this.replaceFile;
    }

    public void setReplaceFile(ReplaceFileRequest replaceFile) {
        this.replaceFile = replaceFile;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public UpdateTextRequest getUpdateText() {
        return this.updateText;
    }

    public void setUpdateText(UpdateTextRequest updateText) {
        this.updateText = updateText;
    }

    public UpdateTaskRequest getUpdateTask() {
        return this.updateTask;
    }

    public void setUpdateTask(UpdateTaskRequest updateTask) {
        this.updateTask = updateTask;
    }

    public static class Builder {
        /**
         * 更新文本元素请求
         * <p> 示例值：
         */
        private UpdateTextElementsRequest updateTextElements;
        /**
         * 更新文本样式请求
         * <p> 示例值：
         */
        private UpdateTextStyleRequest updateTextStyle;
        /**
         * 更新表格属性请求
         * <p> 示例值：
         */
        private UpdateTablePropertyRequest updateTableProperty;
        /**
         * 表格插入新行请求
         * <p> 示例值：
         */
        private InsertTableRowRequest insertTableRow;
        /**
         * 表格插入新列请求
         * <p> 示例值：
         */
        private InsertTableColumnRequest insertTableColumn;
        /**
         * 表格批量删除行请求
         * <p> 示例值：
         */
        private DeleteTableRowsRequest deleteTableRows;
        /**
         * 表格批量删除列请求
         * <p> 示例值：
         */
        private DeleteTableColumnsRequest deleteTableColumns;
        /**
         * 表格合并单元格请求
         * <p> 示例值：
         */
        private MergeTableCellsRequest mergeTableCells;
        /**
         * 表格取消单元格合并状态请求
         * <p> 示例值：
         */
        private UnmergeTableCellsRequest unmergeTableCells;
        /**
         * 分栏插入新的分栏列请求
         * <p> 示例值：
         */
        private InsertGridColumnRequest insertGridColumn;
        /**
         * 分栏删除列请求
         * <p> 示例值：
         */
        private DeleteGridColumnRequest deleteGridColumn;
        /**
         * 更新分栏列宽比例请求
         * <p> 示例值：
         */
        private UpdateGridColumnWidthRatioRequest updateGridColumnWidthRatio;
        /**
         * 替换图片请求
         * <p> 示例值：
         */
        private ReplaceImageRequest replaceImage;
        /**
         * 替换附件请求
         * <p> 示例值：
         */
        private ReplaceFileRequest replaceFile;
        /**
         * Block 唯一标识
         * <p> 示例值：doxcnSS4ouQkQEouGSUkTg9NJPe
         */
        private String blockId;
        /**
         * 更新文本元素及样式请求
         * <p> 示例值：
         */
        private UpdateTextRequest updateText;
        /**
         * 更新任务 Block 请求
         * <p> 示例值：
         */
        private UpdateTaskRequest updateTask;

        /**
         * 更新文本元素请求
         * <p> 示例值：
         *
         * @param updateTextElements
         * @return
         */
        public Builder updateTextElements(UpdateTextElementsRequest updateTextElements) {
            this.updateTextElements = updateTextElements;
            return this;
        }


        /**
         * 更新文本样式请求
         * <p> 示例值：
         *
         * @param updateTextStyle
         * @return
         */
        public Builder updateTextStyle(UpdateTextStyleRequest updateTextStyle) {
            this.updateTextStyle = updateTextStyle;
            return this;
        }


        /**
         * 更新表格属性请求
         * <p> 示例值：
         *
         * @param updateTableProperty
         * @return
         */
        public Builder updateTableProperty(UpdateTablePropertyRequest updateTableProperty) {
            this.updateTableProperty = updateTableProperty;
            return this;
        }


        /**
         * 表格插入新行请求
         * <p> 示例值：
         *
         * @param insertTableRow
         * @return
         */
        public Builder insertTableRow(InsertTableRowRequest insertTableRow) {
            this.insertTableRow = insertTableRow;
            return this;
        }


        /**
         * 表格插入新列请求
         * <p> 示例值：
         *
         * @param insertTableColumn
         * @return
         */
        public Builder insertTableColumn(InsertTableColumnRequest insertTableColumn) {
            this.insertTableColumn = insertTableColumn;
            return this;
        }


        /**
         * 表格批量删除行请求
         * <p> 示例值：
         *
         * @param deleteTableRows
         * @return
         */
        public Builder deleteTableRows(DeleteTableRowsRequest deleteTableRows) {
            this.deleteTableRows = deleteTableRows;
            return this;
        }


        /**
         * 表格批量删除列请求
         * <p> 示例值：
         *
         * @param deleteTableColumns
         * @return
         */
        public Builder deleteTableColumns(DeleteTableColumnsRequest deleteTableColumns) {
            this.deleteTableColumns = deleteTableColumns;
            return this;
        }


        /**
         * 表格合并单元格请求
         * <p> 示例值：
         *
         * @param mergeTableCells
         * @return
         */
        public Builder mergeTableCells(MergeTableCellsRequest mergeTableCells) {
            this.mergeTableCells = mergeTableCells;
            return this;
        }


        /**
         * 表格取消单元格合并状态请求
         * <p> 示例值：
         *
         * @param unmergeTableCells
         * @return
         */
        public Builder unmergeTableCells(UnmergeTableCellsRequest unmergeTableCells) {
            this.unmergeTableCells = unmergeTableCells;
            return this;
        }


        /**
         * 分栏插入新的分栏列请求
         * <p> 示例值：
         *
         * @param insertGridColumn
         * @return
         */
        public Builder insertGridColumn(InsertGridColumnRequest insertGridColumn) {
            this.insertGridColumn = insertGridColumn;
            return this;
        }


        /**
         * 分栏删除列请求
         * <p> 示例值：
         *
         * @param deleteGridColumn
         * @return
         */
        public Builder deleteGridColumn(DeleteGridColumnRequest deleteGridColumn) {
            this.deleteGridColumn = deleteGridColumn;
            return this;
        }


        /**
         * 更新分栏列宽比例请求
         * <p> 示例值：
         *
         * @param updateGridColumnWidthRatio
         * @return
         */
        public Builder updateGridColumnWidthRatio(UpdateGridColumnWidthRatioRequest updateGridColumnWidthRatio) {
            this.updateGridColumnWidthRatio = updateGridColumnWidthRatio;
            return this;
        }


        /**
         * 替换图片请求
         * <p> 示例值：
         *
         * @param replaceImage
         * @return
         */
        public Builder replaceImage(ReplaceImageRequest replaceImage) {
            this.replaceImage = replaceImage;
            return this;
        }


        /**
         * 替换附件请求
         * <p> 示例值：
         *
         * @param replaceFile
         * @return
         */
        public Builder replaceFile(ReplaceFileRequest replaceFile) {
            this.replaceFile = replaceFile;
            return this;
        }


        /**
         * Block 唯一标识
         * <p> 示例值：doxcnSS4ouQkQEouGSUkTg9NJPe
         *
         * @param blockId
         * @return
         */
        public Builder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }


        /**
         * 更新文本元素及样式请求
         * <p> 示例值：
         *
         * @param updateText
         * @return
         */
        public Builder updateText(UpdateTextRequest updateText) {
            this.updateText = updateText;
            return this;
        }


        /**
         * 更新任务 Block 请求
         * <p> 示例值：
         *
         * @param updateTask
         * @return
         */
        public Builder updateTask(UpdateTaskRequest updateTask) {
            this.updateTask = updateTask;
            return this;
        }


        public UpdateBlockRequest build() {
            return new UpdateBlockRequest(this);
        }
    }
}
