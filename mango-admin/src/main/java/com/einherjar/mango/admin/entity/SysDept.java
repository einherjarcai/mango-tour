package com.einherjar.mango.admin.entity;

import java.util.Date;

public class SysDept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.name
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.parent_id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.order_num
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Integer orderNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.last_update_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.last_update_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.del_flag
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    private Byte delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public SysDept(Long id, String name, Long parentId, Integer orderNum, String createBy, Date createTime, String lastUpdateBy, Date lastUpdateTime, Byte delFlag) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.orderNum = orderNum;
        this.createBy = createBy;
        this.createTime = createTime;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateTime = lastUpdateTime;
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public SysDept() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.id
     *
     * @return the value of sys_dept.id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.id
     *
     * @param id the value for sys_dept.id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.name
     *
     * @return the value of sys_dept.name
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.name
     *
     * @param name the value for sys_dept.name
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.parent_id
     *
     * @return the value of sys_dept.parent_id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.parent_id
     *
     * @param parentId the value for sys_dept.parent_id
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.order_num
     *
     * @return the value of sys_dept.order_num
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.order_num
     *
     * @param orderNum the value for sys_dept.order_num
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_by
     *
     * @return the value of sys_dept.create_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_by
     *
     * @param createBy the value for sys_dept.create_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_time
     *
     * @return the value of sys_dept.create_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_time
     *
     * @param createTime the value for sys_dept.create_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.last_update_by
     *
     * @return the value of sys_dept.last_update_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.last_update_by
     *
     * @param lastUpdateBy the value for sys_dept.last_update_by
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.last_update_time
     *
     * @return the value of sys_dept.last_update_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.last_update_time
     *
     * @param lastUpdateTime the value for sys_dept.last_update_time
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.del_flag
     *
     * @return the value of sys_dept.del_flag
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.del_flag
     *
     * @param delFlag the value for sys_dept.del_flag
     *
     * @mbg.generated Wed Sep 11 21:01:36 CST 2019
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}