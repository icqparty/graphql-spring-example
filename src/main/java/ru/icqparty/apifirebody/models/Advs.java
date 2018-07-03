package ru.icqparty.apifirebody.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Advs {
    private int id;
    private Integer objectId;
    private Timestamp createdAt;
    private Timestamp updateAt;
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
    @Column(name = "object_id", nullable = true)
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advs advs = (Advs) o;
        return id == advs.id &&
                Objects.equals(objectId, advs.objectId) &&
                Objects.equals(createdAt, advs.createdAt) &&
                Objects.equals(updateAt, advs.updateAt) &&
                Objects.equals(deletedAt, advs.deletedAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, objectId, createdAt, updateAt, deletedAt);
    }
}
