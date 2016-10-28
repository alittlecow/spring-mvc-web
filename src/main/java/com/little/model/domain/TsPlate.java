package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_plate", schema = "little", catalog = "")
public class TsPlate {
    private String plateCode;
    private String plateNameEn;
    private String plateNameFr;
    private String plateNotes;
    private Integer plateSort;
    private String status;
    private Serializable operateTime;
    private String passLoginname;

    @Id
    @Column(name = "plate_code", nullable = false, length = 20)
    public String getPlateCode() {
        return plateCode;
    }

    public void setPlateCode(String plateCode) {
        this.plateCode = plateCode;
    }

    @Basic
    @Column(name = "plate_name_en", nullable = true, length = 50)
    public String getPlateNameEn() {
        return plateNameEn;
    }

    public void setPlateNameEn(String plateNameEn) {
        this.plateNameEn = plateNameEn;
    }

    @Basic
    @Column(name = "plate_name_fr", nullable = true, length = 50)
    public String getPlateNameFr() {
        return plateNameFr;
    }

    public void setPlateNameFr(String plateNameFr) {
        this.plateNameFr = plateNameFr;
    }

    @Basic
    @Column(name = "plate_notes", nullable = true, length = 200)
    public String getPlateNotes() {
        return plateNotes;
    }

    public void setPlateNotes(String plateNotes) {
        this.plateNotes = plateNotes;
    }

    @Basic
    @Column(name = "plate_sort", nullable = true)
    public Integer getPlateSort() {
        return plateSort;
    }

    public void setPlateSort(Integer plateSort) {
        this.plateSort = plateSort;
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

        TsPlate tsPlate = (TsPlate) o;

        if (plateCode != null ? !plateCode.equals(tsPlate.plateCode) : tsPlate.plateCode != null) return false;
        if (plateNameEn != null ? !plateNameEn.equals(tsPlate.plateNameEn) : tsPlate.plateNameEn != null) return false;
        if (plateNameFr != null ? !plateNameFr.equals(tsPlate.plateNameFr) : tsPlate.plateNameFr != null) return false;
        if (plateNotes != null ? !plateNotes.equals(tsPlate.plateNotes) : tsPlate.plateNotes != null) return false;
        if (plateSort != null ? !plateSort.equals(tsPlate.plateSort) : tsPlate.plateSort != null) return false;
        if (status != null ? !status.equals(tsPlate.status) : tsPlate.status != null) return false;
        if (operateTime != null ? !operateTime.equals(tsPlate.operateTime) : tsPlate.operateTime != null) return false;
        if (passLoginname != null ? !passLoginname.equals(tsPlate.passLoginname) : tsPlate.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = plateCode != null ? plateCode.hashCode() : 0;
        result = 31 * result + (plateNameEn != null ? plateNameEn.hashCode() : 0);
        result = 31 * result + (plateNameFr != null ? plateNameFr.hashCode() : 0);
        result = 31 * result + (plateNotes != null ? plateNotes.hashCode() : 0);
        result = 31 * result + (plateSort != null ? plateSort.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
