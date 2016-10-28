package com.little.model.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tb_answer", schema = "little", catalog = "")
public class TbAnswer {
    private Integer passId;
    private Date time;
    private String type;
    private String content;
    private Integer questionId;
    private Integer id;

    @Basic
    @Column(name = "pass_id", nullable = true)
    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
    @Column(name = "content", nullable = true, length = 2000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "question_id", nullable = true)
    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
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

        TbAnswer tbAnswer = (TbAnswer) o;

        if (passId != null ? !passId.equals(tbAnswer.passId) : tbAnswer.passId != null) return false;
        if (time != null ? !time.equals(tbAnswer.time) : tbAnswer.time != null) return false;
        if (type != null ? !type.equals(tbAnswer.type) : tbAnswer.type != null) return false;
        if (content != null ? !content.equals(tbAnswer.content) : tbAnswer.content != null) return false;
        if (questionId != null ? !questionId.equals(tbAnswer.questionId) : tbAnswer.questionId != null) return false;
        if (id != null ? !id.equals(tbAnswer.id) : tbAnswer.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = passId != null ? passId.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (questionId != null ? questionId.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
