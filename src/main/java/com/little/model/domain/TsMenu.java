package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_menu", schema = "little", catalog = "")
public class TsMenu {
    private String menuCode;
    private String menuNameEn;
    private String menuNameFr;
    private String menuLink;
    private String moduleCode;
    private String plateCode;
    private String menuLevel;
    private Integer menuSort;
    private String menuNotes;
    private String status;
    private Serializable operateTime;
    private String passLoginname;

    @Id
    @Column(name = "menu_code", nullable = false, length = 20)
    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    @Basic
    @Column(name = "menu_name_en", nullable = true, length = 50)
    public String getMenuNameEn() {
        return menuNameEn;
    }

    public void setMenuNameEn(String menuNameEn) {
        this.menuNameEn = menuNameEn;
    }

    @Basic
    @Column(name = "menu_name_fr", nullable = true, length = 50)
    public String getMenuNameFr() {
        return menuNameFr;
    }

    public void setMenuNameFr(String menuNameFr) {
        this.menuNameFr = menuNameFr;
    }

    @Basic
    @Column(name = "menu_link", nullable = true, length = 50)
    public String getMenuLink() {
        return menuLink;
    }

    public void setMenuLink(String menuLink) {
        this.menuLink = menuLink;
    }

    @Basic
    @Column(name = "module_code", nullable = true, length = 20)
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @Basic
    @Column(name = "plate_code", nullable = true, length = 20)
    public String getPlateCode() {
        return plateCode;
    }

    public void setPlateCode(String plateCode) {
        this.plateCode = plateCode;
    }

    @Basic
    @Column(name = "menu_level", nullable = true, length = 10)
    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    @Basic
    @Column(name = "menu_sort", nullable = true)
    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    @Basic
    @Column(name = "menu_notes", nullable = true, length = 200)
    public String getMenuNotes() {
        return menuNotes;
    }

    public void setMenuNotes(String menuNotes) {
        this.menuNotes = menuNotes;
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

        TsMenu tsMenu = (TsMenu) o;

        if (menuCode != null ? !menuCode.equals(tsMenu.menuCode) : tsMenu.menuCode != null) return false;
        if (menuNameEn != null ? !menuNameEn.equals(tsMenu.menuNameEn) : tsMenu.menuNameEn != null) return false;
        if (menuNameFr != null ? !menuNameFr.equals(tsMenu.menuNameFr) : tsMenu.menuNameFr != null) return false;
        if (menuLink != null ? !menuLink.equals(tsMenu.menuLink) : tsMenu.menuLink != null) return false;
        if (moduleCode != null ? !moduleCode.equals(tsMenu.moduleCode) : tsMenu.moduleCode != null) return false;
        if (plateCode != null ? !plateCode.equals(tsMenu.plateCode) : tsMenu.plateCode != null) return false;
        if (menuLevel != null ? !menuLevel.equals(tsMenu.menuLevel) : tsMenu.menuLevel != null) return false;
        if (menuSort != null ? !menuSort.equals(tsMenu.menuSort) : tsMenu.menuSort != null) return false;
        if (menuNotes != null ? !menuNotes.equals(tsMenu.menuNotes) : tsMenu.menuNotes != null) return false;
        if (status != null ? !status.equals(tsMenu.status) : tsMenu.status != null) return false;
        if (operateTime != null ? !operateTime.equals(tsMenu.operateTime) : tsMenu.operateTime != null) return false;
        if (passLoginname != null ? !passLoginname.equals(tsMenu.passLoginname) : tsMenu.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = menuCode != null ? menuCode.hashCode() : 0;
        result = 31 * result + (menuNameEn != null ? menuNameEn.hashCode() : 0);
        result = 31 * result + (menuNameFr != null ? menuNameFr.hashCode() : 0);
        result = 31 * result + (menuLink != null ? menuLink.hashCode() : 0);
        result = 31 * result + (moduleCode != null ? moduleCode.hashCode() : 0);
        result = 31 * result + (plateCode != null ? plateCode.hashCode() : 0);
        result = 31 * result + (menuLevel != null ? menuLevel.hashCode() : 0);
        result = 31 * result + (menuSort != null ? menuSort.hashCode() : 0);
        result = 31 * result + (menuNotes != null ? menuNotes.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
