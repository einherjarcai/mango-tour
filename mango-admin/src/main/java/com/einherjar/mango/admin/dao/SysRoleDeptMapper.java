package com.einherjar.mango.admin.dao;

import com.einherjar.mango.admin.entity.SysRoleDept;

public interface SysRoleDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int insert(SysRoleDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int insertSelective(SysRoleDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    SysRoleDept selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int updateByPrimaryKeySelective(SysRoleDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int updateByPrimaryKey(SysRoleDept record);
}