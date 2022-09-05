package com.misaki.core.page;

import org.springframework.util.ReflectionUtils;

import java.util.List;

public class MybatisPageHelper {
    public static final String findPage = "findPage";
    public static PageResult findPage(PageRequest pageRequest, Object mapper, String findPage) {
        return findPage(pageRequest, mapper, MybatisPageHelper.findPage)
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        Object result = ReflectionUtils.invokeMethod(mapper, queryMethodName, args);
        return getPageResult(pageRequest, new PageInfo((List) result));
    }

    private static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo){
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
