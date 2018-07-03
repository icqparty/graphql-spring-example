package ru.icqparty.apifirebody.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "saunas_halls", schema = "mysql_firebody", catalog = "")
public class SaunasHalls {
    private int id;
    private Integer saunaId;
    private String restroom;
    private String service;
    private String description;
    private String priceHour;
    private String pool;
    private String pairs;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sauna_id", nullable = true)
    public Integer getSaunaId() {
        return saunaId;
    }

    public void setSaunaId(Integer saunaId) {
        this.saunaId = saunaId;
    }

    @Basic
    @Column(name = "restroom", nullable = true, length = 255)
    public String getRestroom() {
        return restroom;
    }

    public void setRestroom(String restroom) {
        this.restroom = restroom;
    }

    @Basic
    @Column(name = "service", nullable = true, length = 255)
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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
    @Column(name = "price_hour", nullable = true, length = 255)
    public String getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(String priceHour) {
        this.priceHour = priceHour;
    }

    @Basic
    @Column(name = "pool", nullable = true, length = 255)
    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    @Basic
    @Column(name = "pairs", nullable = true, length = 255)
    public String getPairs() {
        return pairs;
    }

    public void setPairs(String pairs) {
        this.pairs = pairs;
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
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "deleted_at", nullable = true)
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaunasHalls that = (SaunasHalls) o;
        return id == that.id &&
                Objects.equals(saunaId, that.saunaId) &&
                Objects.equals(restroom, that.restroom) &&
                Objects.equals(service, that.service) &&
                Objects.equals(description, that.description) &&
                Objects.equals(priceHour, that.priceHour) &&
                Objects.equals(pool, that.pool) &&
                Objects.equals(pairs, that.pairs) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(deletedAt, that.deletedAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, saunaId, restroom, service, description, priceHour, pool, pairs, createdAt, updatedAt, deletedAt);
    }
}
