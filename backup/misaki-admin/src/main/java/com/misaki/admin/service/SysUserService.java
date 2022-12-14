package com.misaki.admin.service;

import com.misaki.admin.model.SysUser;
import com.misaki.admin.model.SysUserRole;
import com.misaki.core.page.PageRequest;
import com.misaki.core.service.CurdService;

import java.io.File;
import java.util.List;
import java.util.Set;

/**
 * 用户管理
 * @author Misaki
 * @date 8 13, 2022
 */
public interface SysUserService extends CurdService<SysUser> {


	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userId
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

	/**
	 * 生成用户信息Excel文件
	 * @param pageRequest 要导出的分页查询参数
	 * @return
	 */
	File createUserExcelFile(PageRequest pageRequest);

	SysUser findById(Long id);
}
