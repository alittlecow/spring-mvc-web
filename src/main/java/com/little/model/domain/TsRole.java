package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_role", schema = "little", catalog = "")
public class TsRole {
    private String roleCode;
    private String roleNameEn;
    private String roleNameFr;
    private String roleLevel;
    private String roleNotes;
    private String status;
    private Serializable operateTime;
    private String passLoginname;

    @Id
    @Column(name = "role_code", nullable = false, length = 20)
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "role_name_en", nullable = true, length = 50)
    public String getRoleNameEn() {
        return roleNameEn;
    }

    public void setRoleNameEn(String roleNameEn) {
        this.roleNameEn = roleNameEn;
    }

    @Basic
    @Column(name = "role_name_fr", nullable = true, length = 50)
    public String getRoleNameFr() {
        return roleNameFr;
    }

    public void setRoleNameFr(String roleNameFr) {
        this.roleNameFr = roleNameFr;
    }

    @Basic
    @Column(name = "role_level", nullable = true, length = 10)
    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }

    @Basic
    @Column(name = "role_notes", nullable = true, length = 200)
    public String getRoleNotes() {
        return roleNotes;
    }

    public void setRoleNotes(String roleNotes) {
        this.roleNotes = roleNotes;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "operate_time", nullable = true)
    public Serializable getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Serializable operateTime) {
        this.operateTime = operateTime;
    }

    @Basic
    @Column(name = "pass_loginname", nullable = true, length = 30)
    public String getPassLoginname() {
        return passLoginname;
    }

    public void setPassLoginname(String passLoginname) {
        this.passLoginname = passLoginname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TsRole tsRole = (TsRole) o;

        if (roleCode != null ? !roleCode.equals(tsRole.roleCode) : tsRole.roleCode != null) return false;
        if (roleNameEn != null ? !roleNameEn.equals(tsRole.roleNameEn) : tsRole.roleNameEn != null) return false;
        if (roleNameFr != null ? !roleNameFr.equals(tsRole.roleNameFr) : tsRole.roleNameFr != null) return false;
        if (roleLevel != null ? !roleLevel.equals(tsRole.roleLevel) : tsRole.roleLevel != null) return false;
        if (roleNotes != null ? !roleNotes.equals(tsRole.roleNotes) : tsRole.roleNotes != null) return false;
        if (status != null ? !status.equals(tsRole.status) : tsRole.status != null) return false;
        if (operateTime != null ? !operateTime.equals(tsRole.operateTime) : tsRole.operateTime != null) return false;
        if (passLoginname != null ? !passLoginname.equals(tsRole.passLoginname) : tsRole.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleCode != null ? roleCode.hashCode() : 0;
        result = 31 * result + (roleNameEn != null ? roleNameEn.hashCode() : 0);
        result = 31 * result + (roleNameFr != null ? roleNameFr.hashCode() : 0);
        result = 31 * result + (roleLevel != null ? roleLevel.hashCode() : 0);
        result = 31 * result + (roleNotes != null ? roleNotes.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
