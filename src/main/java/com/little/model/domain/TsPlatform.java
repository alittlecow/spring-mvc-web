package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_platform", schema = "little", catalog = "")
public class TsPlatform {
    private Integer id;
    private String name;
    private String email;
    private String loginname;
    private String pwd;
    private String deptCode;
    private String roleCode;
    private Serializable logintime;
    private String loginip;
    private String status;
    private String tel;
    private String tel2;
    private String psw;
    private String authcode;
    private Serializable operatetime;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "loginname", nullable = true, length = 30)
    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    @Basic
    @Column(name = "pwd", nullable = true, length = 40)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "dept_code", nullable = true, length = 20)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "role_code", nullable = true, length = 20)
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "logintime", nullable = true)
    public Serializable getLogintime() {
        return logintime;
    }

    public void setLogintime(Serializable logintime) {
        this.logintime = logintime;
    }

    @Basic
    @Column(name = "loginip", nullable = true, length = 50)
    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
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
    @Column(name = "tel", nullable = true, length = 20)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "tel2", nullable = true, length = 20)
    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    @Basic
    @Column(name = "psw", nullable = true, length = 70)
    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Basic
    @Column(name = "authcode", nullable = true, length = 50)
    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    @Basic
    @Column(name = "operatetime", nullable = true)
    public Serializable getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Serializable operatetime) {
        this.operatetime = operatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TsPlatform that = (TsPlatform) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (loginname != null ? !loginname.equals(that.loginname) : that.loginname != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (deptCode != null ? !deptCode.equals(that.deptCode) : that.deptCode != null) return false;
        if (roleCode != null ? !roleCode.equals(that.roleCode) : that.roleCode != null) return false;
        if (logintime != null ? !logintime.equals(that.logintime) : that.logintime != null) return false;
        if (loginip != null ? !loginip.equals(that.loginip) : that.loginip != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (tel2 != null ? !tel2.equals(that.tel2) : that.tel2 != null) return false;
        if (psw != null ? !psw.equals(that.psw) : that.psw != null) return false;
        if (authcode != null ? !authcode.equals(that.authcode) : that.authcode != null) return false;
        if (operatetime != null ? !operatetime.equals(that.operatetime) : that.operatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (loginname != null ? loginname.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (roleCode != null ? roleCode.hashCode() : 0);
        result = 31 * result + (logintime != null ? logintime.hashCode() : 0);
        result = 31 * result + (loginip != null ? loginip.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (tel2 != null ? tel2.hashCode() : 0);
        result = 31 * result + (psw != null ? psw.hashCode() : 0);
        result = 31 * result + (authcode != null ? authcode.hashCode() : 0);
        result = 31 * result + (operatetime != null ? operatetime.hashCode() : 0);
        return result;
    }
}
