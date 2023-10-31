package com.ecommerce.dmx.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;

@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date created_at;

    @Column(name = "deleted_at", updatable = true)
    private Date deleted_at = null;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @PrePersist
    protected void onPersist() {
        if (this.created_at == null) {
            this.created_at = new Date();
        }
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }
}