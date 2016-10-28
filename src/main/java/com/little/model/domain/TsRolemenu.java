package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_rolemenu", schema = "little", catalog = "")
@IdClass(TsRolemenuPK.class)
public class TsRolemenu {
    private String roleCode;
    private String menuCode;
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

    @Id
    @Column(name = "menu_code", nullable = false, length = 20)
    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
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

        TsRolemenu that = (TsRolemenu) o;

        if (roleCode != null ? !roleCode.equals(that.roleCode) : that.roleCode != null) return false;
        if (menuCode != null ? !menuCode.equals(that.menuCode) : that.menuCode != null) return false;
        if (operateTime != null ? !operateTime.equals(that.operateTime) : that.operateTime != null) return false;
        if (passLoginname != null ? !passLoginname.equals(that.passLoginname) : that.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleCode != null ? roleCode.hashCode() : 0;
        result = 31 * result + (menuCode != null ? menuCode.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
