package ru.icqparty.apifirebody.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "saunas_images", schema = "mysql_firebody", catalog = "")
public class SaunasImages {
    private int id;
    private Integer saunaId;
    private String file;

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
    @Column(name = "file", nullable = true, length = 255)
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaunasImages that = (SaunasImages) o;
        return id == that.id &&
                Objects.equals(saunaId, that.saunaId) &&
                Objects.equals(file, that.file);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, saunaId, file);
    }
}
