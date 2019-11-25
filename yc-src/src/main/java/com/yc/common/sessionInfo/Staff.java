package com.yc.common.sessionInfo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @创建人 zhangpj
 * @创建时间 2017/11/29
 * @描述
 **/
@JsonAutoDetect
@JsonIgnoreProperties({ "passwd", "handler", "encodePasswd" })
public class Staff implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -3676306905297890750L;

    /**
     * 超级管理员 id
     */
    public static int ADMIN_ID = 1;

    private Long staffId;

    private String password;

    private String staffName;

    private String staffTel;

    private String email;

    private String state;

    private int businessId;

    private String businessName;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return ADMIN_ID == staffId;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}
