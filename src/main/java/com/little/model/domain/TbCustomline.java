package com.little.model.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tb_customline", schema = "little", catalog = "")
public class TbCustomline {
    private Integer id;
    private String name;
    private String sex;
    private String email;
    private String phone;
    private Integer person;
    private Date arrivetime;
    private Date returntime;
    private Integer hotellevel;
    private String otherrequirement;
    private String status;
    private Date createtime;
    private String result;
    private Integer passId;
    private Date dealtime;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "email", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "person", nullable = true)
    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
    }

    @Basic
    @Column(name = "arrivetime", nullable = true)
    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    @Basic
    @Column(name = "returntime", nullable = true)
    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    @Basic
    @Column(name = "hotellevel", nullable = true)
    public Integer getHotellevel() {
        return hotellevel;
    }

    public void setHotellevel(Integer hotellevel) {
        this.hotellevel = hotellevel;
    }

    @Basic
    @Column(name = "otherrequirement", nullable = true, length = 2000)
    public String getOtherrequirement() {
        return otherrequirement;
    }

    public void setOtherrequirement(String otherrequirement) {
        this.otherrequirement = otherrequirement;
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
    @Column(name = "createtime", nullable = true)
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "result", nullable = true, length = 2000)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "pass_id", nullable = true)
    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    @Basic
    @Column(name = "dealtime", nullable = true)
    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCustomline that = (TbCustomline) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (person != null ? !person.equals(that.person) : that.person != null) return false;
        if (arrivetime != null ? !arrivetime.equals(that.arrivetime) : that.arrivetime != null) return false;
        if (returntime != null ? !returntime.equals(that.returntime) : that.returntime != null) return false;
        if (hotellevel != null ? !hotellevel.equals(that.hotellevel) : that.hotellevel != null) return false;
        if (otherrequirement != null ? !otherrequirement.equals(that.otherrequirement) : that.otherrequirement != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (passId != null ? !passId.equals(that.passId) : that.passId != null) return false;
        if (dealtime != null ? !dealtime.equals(that.dealtime) : that.dealtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id != null ? id.hashCode() : 0;
        result1 = 31 * result1 + (name != null ? name.hashCode() : 0);
        result1 = 31 * result1 + (sex != null ? sex.hashCode() : 0);
        result1 = 31 * result1 + (email != null ? email.hashCode() : 0);
        result1 = 31 * result1 + (phone != null ? phone.hashCode() : 0);
        result1 = 31 * result1 + (person != null ? person.hashCode() : 0);
        result1 = 31 * result1 + (arrivetime != null ? arrivetime.hashCode() : 0);
        result1 = 31 * result1 + (returntime != null ? returntime.hashCode() : 0);
        result1 = 31 * result1 + (hotellevel != null ? hotellevel.hashCode() : 0);
        result1 = 31 * result1 + (otherrequirement != null ? otherrequirement.hashCode() : 0);
        result1 = 31 * result1 + (status != null ? status.hashCode() : 0);
        result1 = 31 * result1 + (createtime != null ? createtime.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (passId != null ? passId.hashCode() : 0);
        result1 = 31 * result1 + (dealtime != null ? dealtime.hashCode() : 0);
        return result1;
    }
}
