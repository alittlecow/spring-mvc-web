package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "th_tourdate", schema = "little", catalog = "")
public class ThTourdate {
    private Integer thdId;
    private Integer trdId;
    private String thdFlow;
    private Integer thdBefore;
    private Integer thdAmount;
    private Integer thdAfter;
    private String thdOrderno;
    private String thdType;
    private Integer trdInventory;
    private Integer trdSales;
    private Integer trdPending;
    private Serializable trdTime;
    private String passLoginname;

    @Id
    @Column(name = "thd_id", nullable = false)
    public Integer getThdId() {
        return thdId;
    }

    public void setThdId(Integer thdId) {
        this.thdId = thdId;
    }

    @Basic
    @Column(name = "trd_id", nullable = false)
    public Integer getTrdId() {
        return trdId;
    }

    public void setTrdId(Integer trdId) {
        this.trdId = trdId;
    }

    @Basic
    @Column(name = "thd_flow", nullable = false, length = 1)
    public String getThdFlow() {
        return thdFlow;
    }

    public void setThdFlow(String thdFlow) {
        this.thdFlow = thdFlow;
    }

    @Basic
    @Column(name = "thd_before", nullable = false)
    public Integer getThdBefore() {
        return thdBefore;
    }

    public void setThdBefore(Integer thdBefore) {
        this.thdBefore = thdBefore;
    }

    @Basic
    @Column(name = "thd_amount", nullable = false)
    public Integer getThdAmount() {
        return thdAmount;
    }

    public void setThdAmount(Integer thdAmount) {
        this.thdAmount = thdAmount;
    }

    @Basic
    @Column(name = "thd_after", nullable = false)
    public Integer getThdAfter() {
        return thdAfter;
    }

    public void setThdAfter(Integer thdAfter) {
        this.thdAfter = thdAfter;
    }

    @Basic
    @Column(name = "thd_orderno", nullable = false, length = 20)
    public String getThdOrderno() {
        return thdOrderno;
    }

    public void setThdOrderno(String thdOrderno) {
        this.thdOrderno = thdOrderno;
    }

    @Basic
    @Column(name = "thd_type", nullable = false, length = 4)
    public String getThdType() {
        return thdType;
    }

    public void setThdType(String thdType) {
        this.thdType = thdType;
    }

    @Basic
    @Column(name = "trd_inventory", nullable = false)
    public Integer getTrdInventory() {
        return trdInventory;
    }

    public void setTrdInventory(Integer trdInventory) {
        this.trdInventory = trdInventory;
    }

    @Basic
    @Column(name = "trd_sales", nullable = false)
    public Integer getTrdSales() {
        return trdSales;
    }

    public void setTrdSales(Integer trdSales) {
        this.trdSales = trdSales;
    }

    @Basic
    @Column(name = "trd_pending", nullable = false)
    public Integer getTrdPending() {
        return trdPending;
    }

    public void setTrdPending(Integer trdPending) {
        this.trdPending = trdPending;
    }

    @Basic
    @Column(name = "trd_time", nullable = false)
    public Serializable getTrdTime() {
        return trdTime;
    }

    public void setTrdTime(Serializable trdTime) {
        this.trdTime = trdTime;
    }

    @Basic
    @Column(name = "pass_loginname", nullable = false, length = 30)
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

        ThTourdate that = (ThTourdate) o;

        if (thdId != null ? !thdId.equals(that.thdId) : that.thdId != null) return false;
        if (trdId != null ? !trdId.equals(that.trdId) : that.trdId != null) return false;
        if (thdFlow != null ? !thdFlow.equals(that.thdFlow) : that.thdFlow != null) return false;
        if (thdBefore != null ? !thdBefore.equals(that.thdBefore) : that.thdBefore != null) return false;
        if (thdAmount != null ? !thdAmount.equals(that.thdAmount) : that.thdAmount != null) return false;
        if (thdAfter != null ? !thdAfter.equals(that.thdAfter) : that.thdAfter != null) return false;
        if (thdOrderno != null ? !thdOrderno.equals(that.thdOrderno) : that.thdOrderno != null) return false;
        if (thdType != null ? !thdType.equals(that.thdType) : that.thdType != null) return false;
        if (trdInventory != null ? !trdInventory.equals(that.trdInventory) : that.trdInventory != null) return false;
        if (trdSales != null ? !trdSales.equals(that.trdSales) : that.trdSales != null) return false;
        if (trdPending != null ? !trdPending.equals(that.trdPending) : that.trdPending != null) return false;
        if (trdTime != null ? !trdTime.equals(that.trdTime) : that.trdTime != null) return false;
        if (passLoginname != null ? !passLoginname.equals(that.passLoginname) : that.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thdId != null ? thdId.hashCode() : 0;
        result = 31 * result + (trdId != null ? trdId.hashCode() : 0);
        result = 31 * result + (thdFlow != null ? thdFlow.hashCode() : 0);
        result = 31 * result + (thdBefore != null ? thdBefore.hashCode() : 0);
        result = 31 * result + (thdAmount != null ? thdAmount.hashCode() : 0);
        result = 31 * result + (thdAfter != null ? thdAfter.hashCode() : 0);
        result = 31 * result + (thdOrderno != null ? thdOrderno.hashCode() : 0);
        result = 31 * result + (thdType != null ? thdType.hashCode() : 0);
        result = 31 * result + (trdInventory != null ? trdInventory.hashCode() : 0);
        result = 31 * result + (trdSales != null ? trdSales.hashCode() : 0);
        result = 31 * result + (trdPending != null ? trdPending.hashCode() : 0);
        result = 31 * result + (trdTime != null ? trdTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
