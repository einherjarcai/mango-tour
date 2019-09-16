package com.einherjar.mango.admin.service;

import com.einherjar.mango.admin.entity.SysUser;
import com.einherjar.mango.core.service.CurdService;

import java.util.List;

/**
 * @author :   einherjar
 * @file :   SysUserService.java
 * @create :   2019-09-11 21:11
 * @Description :
 */
public interface SysUserService extends CurdService<SysUser> {
    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

    SysUser selectOne(Long i);
}
