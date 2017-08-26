package com.up72.hq.model;


public class PushDevice {
    /**
     * 主键       db_column: ID
     */
    private Long id;
    /**
     * 类型 1安卓 2IOS
     */
    private int type;
    /**
     * 设备号
     */
    private   String device;
    /**
     * 加入时间
     */
    private Long  addTime;
    /**
     * 是否推送（0不推送 1推送）
     */
    private int status;
    /**
     * 用户ID
     */
    private Long customerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}
