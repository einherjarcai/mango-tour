package com.einherjar.mango.admin.service;

import com.einherjar.mango.admin.entity.SysDict;
import com.einherjar.mango.core.service.CurdService;

import java.util.List;

/**
 * 字典管理
 * @author :   einherjar
 * @date :   2019-09-15 15:32
 */
public interface SysDictService extends CurdService<SysDict> {
    /**
     * 根据名称查询
     * @param label
     * @return
     */
    List<SysDict> findByLabel(String label);
}
