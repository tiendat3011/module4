package com.example.blog.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private String dateWrite;
    @ColumnDefault("0")
    private Integer status;

    private Date createDay;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog(Integer id, String title, String content, String dateWrite, Integer status, Date createDay, Category category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateWrite = dateWrite;
        this.status = status;
        this.createDay = createDay;
        this.category = category;
    }

    public Blog() {
    }

    public Blog(Integer id, String title, String content, String dateWrite, Integer status, Date createDay) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateWrite = dateWrite;
        this.status = status;
        this.createDay = createDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateWrite() {
        return dateWrite;
    }

    public void setDateWrite(String dateWrite) {
        this.dateWrite = dateWrite;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }
}