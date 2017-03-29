package org.movie.entity;

/**
 * Created by guowei on 2017/2/25.
 * 管理员实体类 admin_info
 */

public class Admin {
    //管理员id
    private String adminId;
    //管理员用户名
    private String adminName;
    //管理员密码
    private String adminPassword;
    //状态
    private int adminStatus;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public int getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(int adminStatus) {
        this.adminStatus = adminStatus;
    }
}
