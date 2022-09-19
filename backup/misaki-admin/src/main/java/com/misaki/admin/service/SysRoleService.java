package com.misaki.admin.service;

import com.misaki.admin.model.SysMenu;
import com.misaki.admin.model.SysRole;
import com.misaki.admin.model.SysRoleMenu;
import com.misaki.core.service.CurdService;

import java.util.List;

/**
 * 角色管理
 * @author Misaki
 * @date 8 13, 2022
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

	SysRole findById(Long id);
}
