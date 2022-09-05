package com.misaki.core.service;

import com.misaki.core.page.PageRequest;
import com.misaki.core.page.PageResult;

import java.util.List;

public interface CurdService<T> {
    /**
     * 保存操作
     * @param record
     */
    int save(T record);

    /**
     * 删除操作
     * @param entities
     */
    int delete(List<T> records);

    /**
     * 根据ID查询
     * @param id
     */
    T findByID(Long id);

    /**
     * 分页查询
     */
    PageResult findPage(PageRequest pageRequest);
}
