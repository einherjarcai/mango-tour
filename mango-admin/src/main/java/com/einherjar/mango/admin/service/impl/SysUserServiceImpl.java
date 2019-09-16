package com.einherjar.mango.admin.service.impl;

import com.einherjar.mango.admin.dao.SysUserMapper;
import com.einherjar.mango.admin.entity.SysUser;
import com.einherjar.mango.admin.service.SysUserService;
import com.einherjar.mango.core.page.MybatisPageHelper;
import com.einherjar.mango.core.page.PageRequest;
import com.einherjar.mango.core.page.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :   einherjar
 * @file :   SysUserServiceImpl.java
 * @create :   2019-09-11 21:12
 * @Description :
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    @Override
    public SysUser selectOne(Long i) {
        return sysUserMapper.selectByPrimaryKey(i);
    }

    @Override
    public int save(SysUser record) {
        return 0;
    }

    @Override
    public int delete(SysUser record) {
        return 0;
    }

    @Override
    public int delete(List<SysUser> records) {
        return 0;
    }

    @Override
    public SysUser findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
    }
}
