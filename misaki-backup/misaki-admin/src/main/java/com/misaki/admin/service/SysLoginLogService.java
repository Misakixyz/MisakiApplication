package com.misaki.admin.service;

import com.misaki.admin.model.SysLoginLog;
import com.misaki.core.service.CurdService;

/**
 * 登录日志
 * @author Misaki
 * @date 8 13, 2022
 */
public interface SysLoginLogService extends CurdService<SysLoginLog> {

    int delete(SysLoginLog record);

    SysLoginLog findById(Long id);
}
