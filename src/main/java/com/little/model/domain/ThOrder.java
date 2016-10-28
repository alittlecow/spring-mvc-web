package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "th_order", schema = "little", catalog = "")
public class ThOrder {
    private Integer id;
    private String orderno;
    private Integer userId;
    private String contact;
    private String email;
    private String tel;
    private Integer deptId;
    private Integer tourId;
    private Integer adults;
    private Integer children;
    private Integer room;
    private Serializable departure;
    private BigDecimal total;
    private String state;
    private Serializable placedtime;
    private Integer point;
    private BigDecimal gross;
    private BigDecimal net;
    private BigDecimal tax;
    private Serializable operatetime;
    private Integer passId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderno", nullable = false, length = 100)
    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "contact", nullable = true, length = 30)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 127)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "dept_id", nullable = true)
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "tour_id", nullable = true)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "adults", nullable = true)
    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    @Basic
    @Column(name = "children", nullable = true)
    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    @Basic
    @Column(name = "room", nullable = true)
    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    @Basic
    @Column(name = "departure", nullable = true)
    public Serializable getDeparture() {
        return departure;
    }

    public void setDeparture(Serializable departure) {
        this.departure = departure;
    }

    @Basic
    @Column(name = "total", nullable = true, precision = 2)
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 2)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "placedtime", nullable = true)
    public Serializable getPlacedtime() {
        return placedtime;
    }

    public void setPlacedtime(Serializable placedtime) {
        this.placedtime = placedtime;
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
    @Column(name = "gross", nullable = true, precision = 2)
    public BigDecimal getGross() {
        return gross;
    }

    public void setGross(BigDecimal gross) {
        this.gross = gross;
    }

    @Basic
    @Column(name = "net", nullable = true, precision = 2)
    public BigDecimal getNet() {
        return net;
    }

    public void setNet(BigDecimal net) {
        this.net = net;
    }

    @Basic
    @Column(name = "tax", nullable = true, precision = 2)
    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
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
    @Column(name = "pass_id", nullable = true)
    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThOrder thOrder = (ThOrder) o;

        if (id != null ? !id.equals(thOrder.id) : thOrder.id != null) return false;
        if (orderno != null ? !orderno.equals(thOrder.orderno) : thOrder.orderno != null) return false;
        if (userId != null ? !userId.equals(thOrder.userId) : thOrder.userId != null) return false;
        if (contact != null ? !contact.equals(thOrder.contact) : thOrder.contact != null) return false;
        if (email != null ? !email.equals(thOrder.email) : thOrder.email != null) return false;
        if (tel != null ? !tel.equals(thOrder.tel) : thOrder.tel != null) return false;
        if (deptId != null ? !deptId.equals(thOrder.deptId) : thOrder.deptId != null) return false;
        if (tourId != null ? !tourId.equals(thOrder.tourId) : thOrder.tourId != null) return false;
        if (adults != null ? !adults.equals(thOrder.adults) : thOrder.adults != null) return false;
        if (children != null ? !children.equals(thOrder.children) : thOrder.children != null) return false;
        if (room != null ? !room.equals(thOrder.room) : thOrder.room != null) return false;
        if (departure != null ? !departure.equals(thOrder.departure) : thOrder.departure != null) return false;
        if (total != null ? !total.equals(thOrder.total) : thOrder.total != null) return false;
        if (state != null ? !state.equals(thOrder.state) : thOrder.state != null) return false;
        if (placedtime != null ? !placedtime.equals(thOrder.placedtime) : thOrder.placedtime != null) return false;
        if (point != null ? !point.equals(thOrder.point) : thOrder.point != null) return false;
        if (gross != null ? !gross.equals(thOrder.gross) : thOrder.gross != null) return false;
        if (net != null ? !net.equals(thOrder.net) : thOrder.net != null) return false;
        if (tax != null ? !tax.equals(thOrder.tax) : thOrder.tax != null) return false;
        if (operatetime != null ? !operatetime.equals(thOrder.operatetime) : thOrder.operatetime != null) return false;
        if (passId != null ? !passId.equals(thOrder.passId) : thOrder.passId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderno != null ? orderno.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (deptId != null ? deptId.hashCode() : 0);
        result = 31 * result + (tourId != null ? tourId.hashCode() : 0);
        result = 31 * result + (adults != null ? adults.hashCode() : 0);
        result = 31 * result + (children != null ? children.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (departure != null ? departure.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (placedtime != null ? placedtime.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        result = 31 * result + (gross != null ? gross.hashCode() : 0);
        result = 31 * result + (net != null ? net.hashCode() : 0);
        result = 31 * result + (tax != null ? tax.hashCode() : 0);
        result = 31 * result + (operatetime != null ? operatetime.hashCode() : 0);
        result = 31 * result + (passId != null ? passId.hashCode() : 0);
        return result;
    }
}
