package com.little.model.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tb_contact", schema = "little", catalog = "")
public class TbContact {
    private Date dealtime;
    private Integer passId;
    private String deal;
    private Date createtime;
    private String status;
    private String type;
    private String content;
    private String phone;
    private String email;
    private String name;
    private Integer id;

    @Basic
    @Column(name = "dealtime", nullable = true)
    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
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
    @Column(name = "deal", nullable = true, length = 1000)
    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
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
    @Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "content", nullable = true, length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbContact tbContact = (TbContact) o;

        if (dealtime != null ? !dealtime.equals(tbContact.dealtime) : tbContact.dealtime != null) return false;
        if (passId != null ? !passId.equals(tbContact.passId) : tbContact.passId != null) return false;
        if (deal != null ? !deal.equals(tbContact.deal) : tbContact.deal != null) return false;
        if (createtime != null ? !createtime.equals(tbContact.createtime) : tbContact.createtime != null) return false;
        if (status != null ? !status.equals(tbContact.status) : tbContact.status != null) return false;
        if (type != null ? !type.equals(tbContact.type) : tbContact.type != null) return false;
        if (content != null ? !content.equals(tbContact.content) : tbContact.content != null) return false;
        if (phone != null ? !phone.equals(tbContact.phone) : tbContact.phone != null) return false;
        if (email != null ? !email.equals(tbContact.email) : tbContact.email != null) return false;
        if (name != null ? !name.equals(tbContact.name) : tbContact.name != null) return false;
        if (id != null ? !id.equals(tbContact.id) : tbContact.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dealtime != null ? dealtime.hashCode() : 0;
        result = 31 * result + (passId != null ? passId.hashCode() : 0);
        result = 31 * result + (deal != null ? deal.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
