package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "th_rating", schema = "little", catalog = "")
public class ThRating {
    private Integer id;
    private String target;
    private Integer targetid;
    private Integer userId;
    private Integer alllevel;
    private String allcontent;
    private Integer routinglevel;
    private String routingcontent;
    private Integer hotellevel;
    private String hotelcontent;
    private Integer trafficlevel;
    private String trafficcontent;
    private Integer picture;
    private Serializable ratingtime;
    private String source;
    private String orderno;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "target", nullable = true, length = 1)
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Basic
    @Column(name = "targetid", nullable = true)
    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
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
    @Column(name = "alllevel", nullable = true)
    public Integer getAlllevel() {
        return alllevel;
    }

    public void setAlllevel(Integer alllevel) {
        this.alllevel = alllevel;
    }

    @Basic
    @Column(name = "allcontent", nullable = true, length = 2000)
    public String getAllcontent() {
        return allcontent;
    }

    public void setAllcontent(String allcontent) {
        this.allcontent = allcontent;
    }

    @Basic
    @Column(name = "routinglevel", nullable = true)
    public Integer getRoutinglevel() {
        return routinglevel;
    }

    public void setRoutinglevel(Integer routinglevel) {
        this.routinglevel = routinglevel;
    }

    @Basic
    @Column(name = "routingcontent", nullable = true, length = 2000)
    public String getRoutingcontent() {
        return routingcontent;
    }

    public void setRoutingcontent(String routingcontent) {
        this.routingcontent = routingcontent;
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
    @Column(name = "hotelcontent", nullable = true, length = 2000)
    public String getHotelcontent() {
        return hotelcontent;
    }

    public void setHotelcontent(String hotelcontent) {
        this.hotelcontent = hotelcontent;
    }

    @Basic
    @Column(name = "trafficlevel", nullable = true)
    public Integer getTrafficlevel() {
        return trafficlevel;
    }

    public void setTrafficlevel(Integer trafficlevel) {
        this.trafficlevel = trafficlevel;
    }

    @Basic
    @Column(name = "trafficcontent", nullable = true, length = 2000)
    public String getTrafficcontent() {
        return trafficcontent;
    }

    public void setTrafficcontent(String trafficcontent) {
        this.trafficcontent = trafficcontent;
    }

    @Basic
    @Column(name = "picture", nullable = true)
    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "ratingtime", nullable = true)
    public Serializable getRatingtime() {
        return ratingtime;
    }

    public void setRatingtime(Serializable ratingtime) {
        this.ratingtime = ratingtime;
    }

    @Basic
    @Column(name = "source", nullable = true, length = 1)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "orderno", nullable = true, length = 100)
    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThRating thRating = (ThRating) o;

        if (id != null ? !id.equals(thRating.id) : thRating.id != null) return false;
        if (target != null ? !target.equals(thRating.target) : thRating.target != null) return false;
        if (targetid != null ? !targetid.equals(thRating.targetid) : thRating.targetid != null) return false;
        if (userId != null ? !userId.equals(thRating.userId) : thRating.userId != null) return false;
        if (alllevel != null ? !alllevel.equals(thRating.alllevel) : thRating.alllevel != null) return false;
        if (allcontent != null ? !allcontent.equals(thRating.allcontent) : thRating.allcontent != null) return false;
        if (routinglevel != null ? !routinglevel.equals(thRating.routinglevel) : thRating.routinglevel != null)
            return false;
        if (routingcontent != null ? !routingcontent.equals(thRating.routingcontent) : thRating.routingcontent != null)
            return false;
        if (hotellevel != null ? !hotellevel.equals(thRating.hotellevel) : thRating.hotellevel != null) return false;
        if (hotelcontent != null ? !hotelcontent.equals(thRating.hotelcontent) : thRating.hotelcontent != null)
            return false;
        if (trafficlevel != null ? !trafficlevel.equals(thRating.trafficlevel) : thRating.trafficlevel != null)
            return false;
        if (trafficcontent != null ? !trafficcontent.equals(thRating.trafficcontent) : thRating.trafficcontent != null)
            return false;
        if (picture != null ? !picture.equals(thRating.picture) : thRating.picture != null) return false;
        if (ratingtime != null ? !ratingtime.equals(thRating.ratingtime) : thRating.ratingtime != null) return false;
        if (source != null ? !source.equals(thRating.source) : thRating.source != null) return false;
        if (orderno != null ? !orderno.equals(thRating.orderno) : thRating.orderno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (targetid != null ? targetid.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (alllevel != null ? alllevel.hashCode() : 0);
        result = 31 * result + (allcontent != null ? allcontent.hashCode() : 0);
        result = 31 * result + (routinglevel != null ? routinglevel.hashCode() : 0);
        result = 31 * result + (routingcontent != null ? routingcontent.hashCode() : 0);
        result = 31 * result + (hotellevel != null ? hotellevel.hashCode() : 0);
        result = 31 * result + (hotelcontent != null ? hotelcontent.hashCode() : 0);
        result = 31 * result + (trafficlevel != null ? trafficlevel.hashCode() : 0);
        result = 31 * result + (trafficcontent != null ? trafficcontent.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (ratingtime != null ? ratingtime.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (orderno != null ? orderno.hashCode() : 0);
        return result;
    }
}
