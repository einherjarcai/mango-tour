package com.einherjar.mango.admin.dao;

import com.einherjar.mango.admin.entity.SysMenu;

public interface SysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int insertSelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    SysMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int updateByPrimaryKey(SysMenu record);
}