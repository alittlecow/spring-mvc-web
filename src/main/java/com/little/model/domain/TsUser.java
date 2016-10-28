package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_user", schema = "little", catalog = "")
public class TsUser {
    private Integer id;
    private String name;
    private String nickname;
    private String email;
    private String password;
    private String sex;
    private String passport;
    private String status;
    private Serializable locktime;
    private String lockreson;
    private Serializable regtime;
    private Integer point;
    private Integer usablepoint;
    private String type;
    private String facebookname;
    private String facebookpwd;
    private String ip;
    private String authcode;
    private Serializable operatetime;
    private String psw;

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
    @Column(name = "nickname", nullable = true, length = 20)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "passport", nullable = true, length = 9)
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
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
    @Column(name = "locktime", nullable = true)
    public Serializable getLocktime() {
        return locktime;
    }

    public void setLocktime(Serializable locktime) {
        this.locktime = locktime;
    }

    @Basic
    @Column(name = "lockreson", nullable = true, length = 200)
    public String getLockreson() {
        return lockreson;
    }

    public void setLockreson(String lockreson) {
        this.lockreson = lockreson;
    }

    @Basic
    @Column(name = "regtime", nullable = true)
    public Serializable getRegtime() {
        return regtime;
    }

    public void setRegtime(Serializable regtime) {
        this.regtime = regtime;
    }

    @Basic
    @Column(name = "point", nullable = true)
    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Basic
    @Column(name = "usablepoint", nullable = true)
    public Integer getUsablepoint() {
        return usablepoint;
    }

    public void setUsablepoint(Integer usablepoint) {
        this.usablepoint = usablepoint;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "facebookname", nullable = true, length = 30)
    public String getFacebookname() {
        return facebookname;
    }

    public void setFacebookname(String facebookname) {
        this.facebookname = facebookname;
    }

    @Basic
    @Column(name = "facebookpwd", nullable = true, length = 20)
    public String getFacebookpwd() {
        return facebookpwd;
    }

    public void setFacebookpwd(String facebookpwd) {
        this.facebookpwd = facebookpwd;
    }

    @Basic
    @Column(name = "ip", nullable = true, length = 50)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    @Basic
    @Column(name = "psw", nullable = false, length = 200)
    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TsUser tsUser = (TsUser) o;

        if (id != null ? !id.equals(tsUser.id) : tsUser.id != null) return false;
        if (name != null ? !name.equals(tsUser.name) : tsUser.name != null) return false;
        if (nickname != null ? !nickname.equals(tsUser.nickname) : tsUser.nickname != null) return false;
        if (email != null ? !email.equals(tsUser.email) : tsUser.email != null) return false;
        if (password != null ? !password.equals(tsUser.password) : tsUser.password != null) return false;
        if (sex != null ? !sex.equals(tsUser.sex) : tsUser.sex != null) return false;
        if (passport != null ? !passport.equals(tsUser.passport) : tsUser.passport != null) return false;
        if (status != null ? !status.equals(tsUser.status) : tsUser.status != null) return false;
        if (locktime != null ? !locktime.equals(tsUser.locktime) : tsUser.locktime != null) return false;
        if (lockreson != null ? !lockreson.equals(tsUser.lockreson) : tsUser.lockreson != null) return false;
        if (regtime != null ? !regtime.equals(tsUser.regtime) : tsUser.regtime != null) return false;
        if (point != null ? !point.equals(tsUser.point) : tsUser.point != null) return false;
        if (usablepoint != null ? !usablepoint.equals(tsUser.usablepoint) : tsUser.usablepoint != null) return false;
        if (type != null ? !type.equals(tsUser.type) : tsUser.type != null) return false;
        if (facebookname != null ? !facebookname.equals(tsUser.facebookname) : tsUser.facebookname != null)
            return false;
        if (facebookpwd != null ? !facebookpwd.equals(tsUser.facebookpwd) : tsUser.facebookpwd != null) return false;
        if (ip != null ? !ip.equals(tsUser.ip) : tsUser.ip != null) return false;
        if (authcode != null ? !authcode.equals(tsUser.authcode) : tsUser.authcode != null) return false;
        if (operatetime != null ? !operatetime.equals(tsUser.operatetime) : tsUser.operatetime != null) return false;
        if (psw != null ? !psw.equals(tsUser.psw) : tsUser.psw != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (locktime != null ? locktime.hashCode() : 0);
        result = 31 * result + (lockreson != null ? lockreson.hashCode() : 0);
        result = 31 * result + (regtime != null ? regtime.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        result = 31 * result + (usablepoint != null ? usablepoint.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (facebookname != null ? facebookname.hashCode() : 0);
        result = 31 * result + (facebookpwd != null ? facebookpwd.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (authcode != null ? authcode.hashCode() : 0);
        result = 31 * result + (operatetime != null ? operatetime.hashCode() : 0);
        result = 31 * result + (psw != null ? psw.hashCode() : 0);
        return result;
    }
}
