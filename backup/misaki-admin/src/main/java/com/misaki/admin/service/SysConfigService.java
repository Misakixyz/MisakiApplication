package com.misaki.admin.service;

import com.misaki.admin.model.SysConfig;
import com.misaki.core.service.CurdService;

import java.util.List;

/**
 * 系统配置管理
 * @author Misaki
 * @date 8 13, 2022
 */
public interface SysConfigService extends CurdService<SysConfig> {


	SysConfig findById(Long id);

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
