package ru.icqparty.apifirebody.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Saunas {
    private int id;
    private Integer cityId;
    private String description;
    private String name;
    private Timestamp createdAt;
    private Timestamp updateAt;
    private Timestamp deletedAt;
    private Integer status;
    private String address;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "city_id", nullable = true)
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "update_at", nullable = true)
    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Basic
    @Column(name = "deleted_at", nullable = true)
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Saunas saunas = (Saunas) o;
        return id == saunas.id &&
                Objects.equals(cityId, saunas.cityId) &&
                Objects.equals(description, saunas.description) &&
                Objects.equals(name, saunas.name) &&
                Objects.equals(createdAt, saunas.createdAt) &&
                Objects.equals(updateAt, saunas.updateAt) &&
                Objects.equals(deletedAt, saunas.deletedAt) &&
                Objects.equals(status, saunas.status) &&
                Objects.equals(address, saunas.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, cityId, description, name, createdAt, updateAt, deletedAt, status, address);
    }
}
