package com.misaki.admin.service;

import com.misaki.admin.model.SysDept;
import com.misaki.core.service.CurdService;

import java.util.List;

/**
 * 机构管理
 * @author Misaki
 * @date 8 13, 2022
 */
public interface SysDeptService extends CurdService<SysDept> {


	SysDept findById(Long id);

	/**
	 * 查询机构树
	 * @return
	 */
	List<SysDept> findTree();
}
