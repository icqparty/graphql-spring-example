package ru.icqparty.apifirebody.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "saunas_phones", schema = "mysql_firebody", catalog = "")
public class SaunasPhones {
    private int id;
    private Integer saunaId;
    private String value;

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
    @Column(name = "value", nullable = true, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaunasPhones that = (SaunasPhones) o;
        return id == that.id &&
                Objects.equals(saunaId, that.saunaId) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, saunaId, value);
    }
}
