package com.einherjar.mango.admin.dao;

import com.einherjar.mango.admin.entity.SysConfig;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    SysConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    int updateByPrimaryKey(SysConfig record);
}