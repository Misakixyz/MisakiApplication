package com.misaki.admin.mapper;

import com.misaki.admin.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户管理 Mapper 接口
 * </p>
 *
 * @author Misaki
 * @since 2022-09-03
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
