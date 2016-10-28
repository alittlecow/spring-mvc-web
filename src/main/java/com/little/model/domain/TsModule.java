package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_module", schema = "little", catalog = "")
public class TsModule {
    private String moduleCode;
    private String moduleNameEn;
    private String moduleNameFr;
    private String moduleNotes;
    private Integer moduleSort;
    private String status;
    private Serializable operateTime;
    private String passLoginname;

    @Id
    @Column(name = "module_code", nullable = false, length = 20)
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @Basic
    @Column(name = "module_name_en", nullable = true, length = 50)
    public String getModuleNameEn() {
        return moduleNameEn;
    }

    public void setModuleNameEn(String moduleNameEn) {
        this.moduleNameEn = moduleNameEn;
    }

    @Basic
    @Column(name = "module_name_fr", nullable = true, length = 50)
    public String getModuleNameFr() {
        return moduleNameFr;
    }

    public void setModuleNameFr(String moduleNameFr) {
        this.moduleNameFr = moduleNameFr;
    }

    @Basic
    @Column(name = "module_notes", nullable = true, length = 200)
    public String getModuleNotes() {
        return moduleNotes;
    }

    public void setModuleNotes(String moduleNotes) {
        this.moduleNotes = moduleNotes;
    }

    @Basic
    @Column(name = "module_sort", nullable = true)
    public Integer getModuleSort() {
        return moduleSort;
    }

    public void setModuleSort(Integer moduleSort) {
        this.moduleSort = moduleSort;
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

        TsModule tsModule = (TsModule) o;

        if (moduleCode != null ? !moduleCode.equals(tsModule.moduleCode) : tsModule.moduleCode != null) return false;
        if (moduleNameEn != null ? !moduleNameEn.equals(tsModule.moduleNameEn) : tsModule.moduleNameEn != null)
            return false;
        if (moduleNameFr != null ? !moduleNameFr.equals(tsModule.moduleNameFr) : tsModule.moduleNameFr != null)
            return false;
        if (moduleNotes != null ? !moduleNotes.equals(tsModule.moduleNotes) : tsModule.moduleNotes != null)
            return false;
        if (moduleSort != null ? !moduleSort.equals(tsModule.moduleSort) : tsModule.moduleSort != null) return false;
        if (status != null ? !status.equals(tsModule.status) : tsModule.status != null) return false;
        if (operateTime != null ? !operateTime.equals(tsModule.operateTime) : tsModule.operateTime != null)
            return false;
        if (passLoginname != null ? !passLoginname.equals(tsModule.passLoginname) : tsModule.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduleCode != null ? moduleCode.hashCode() : 0;
        result = 31 * result + (moduleNameEn != null ? moduleNameEn.hashCode() : 0);
        result = 31 * result + (moduleNameFr != null ? moduleNameFr.hashCode() : 0);
        result = 31 * result + (moduleNotes != null ? moduleNotes.hashCode() : 0);
        result = 31 * result + (moduleSort != null ? moduleSort.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
