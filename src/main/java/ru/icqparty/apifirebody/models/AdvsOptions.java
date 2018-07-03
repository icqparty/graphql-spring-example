package ru.icqparty.apifirebody.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "advs_options", schema = "mysql_firebody", catalog = "")
public class AdvsOptions {
    private int id;
    private String name;
    private String value;
    private Integer advId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "value", nullable = true, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "adv_id", nullable = true)
    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvsOptions that = (AdvsOptions) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(value, that.value) &&
                Objects.equals(advId, that.advId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, value, advId);
    }
}
