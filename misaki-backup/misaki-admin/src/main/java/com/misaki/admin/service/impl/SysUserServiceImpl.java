package com.misaki.admin.service.impl;

import com.misaki.admin.entity.SysUser;
import com.misaki.admin.mapper.SysUserMapper;
import com.misaki.admin.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户管理 服务实现类
 * </p>
 *
 * @author Misaki
 * @since 2022-09-03
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
