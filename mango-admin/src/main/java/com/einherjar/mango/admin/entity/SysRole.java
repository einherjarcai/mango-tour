package com.einherjar.mango.admin.entity;

import java.util.Date;

public class SysRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.name
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.remark
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.last_update_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.last_update_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.del_flag
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Byte delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public SysRole(Long id, String name, String remark, String createBy, Date createTime, String lastUpdateBy, Date lastUpdateTime, Byte delFlag) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.createBy = createBy;
        this.createTime = createTime;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateTime = lastUpdateTime;
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public SysRole() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.name
     *
     * @return the value of sys_role.name
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.name
     *
     * @param name the value for sys_role.name
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.remark
     *
     * @return the value of sys_role.remark
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.remark
     *
     * @param remark the value for sys_role.remark
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_by
     *
     * @return the value of sys_role.create_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_by
     *
     * @param createBy the value for sys_role.create_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_time
     *
     * @param createTime the value for sys_role.create_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.last_update_by
     *
     * @return the value of sys_role.last_update_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.last_update_by
     *
     * @param lastUpdateBy the value for sys_role.last_update_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.last_update_time
     *
     * @return the value of sys_role.last_update_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.last_update_time
     *
     * @param lastUpdateTime the value for sys_role.last_update_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.del_flag
     *
     * @return the value of sys_role.del_flag
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.del_flag
     *
     * @param delFlag the value for sys_role.del_flag
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}