package com.example.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "singer")
    private String singer;
    @Column(name = "category")
    private String category;
    @Column(name = "link")
    private String link;

    @ColumnDefault("0")
    private int status;

    public Music() {
    }

    public Music(Integer id, String name, String singer, String category, String link, int status) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
        this.link = link;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}