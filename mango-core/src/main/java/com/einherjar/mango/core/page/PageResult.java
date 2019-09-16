package com.einherjar.mango.core.page;

import lombok.Data;

import java.util.List;

/**
 * 分页返回结果
 * @author :   einherjar
 * @date :   2019-09-15 13:06
 */
@Data
public class PageResult {
    /**
     * 当前页码
     */
    private int pageNum;

    /**
     * 每页数量
     */
    private int pageSize;

    /**
     * 记录总数
     */
    private Long totalSize;

    /**
     * 页码总数
     */
    private int totalPages;

    /**
     * 分页数据
     */
    private List<?> content;
}
