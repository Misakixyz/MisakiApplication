package com.misaki.admin.service;

import com.misaki.admin.model.SysDict;
import com.misaki.core.service.CurdService;

import java.util.List;

/**
 * 字典管理
 * @author Misaki
 * @date 8 13, 2022
 */
public interface SysDictService extends CurdService<SysDict> {

	int delete(SysDict record);

	SysDict findById(Long id);

    /**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
