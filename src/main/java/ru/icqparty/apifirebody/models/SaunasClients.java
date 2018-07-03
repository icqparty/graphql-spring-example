package ru.icqparty.apifirebody.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "saunas_clients", schema = "mysql_firebody", catalog = "")
public class SaunasClients {
    private int id;
    private Integer clientId;
    private Integer saunaId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "client_id", nullable = true)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "sauna_id", nullable = true)
    public Integer getSaunaId() {
        return saunaId;
    }

    public void setSaunaId(Integer saunaId) {
        this.saunaId = saunaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaunasClients that = (SaunasClients) o;
        return id == that.id &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(saunaId, that.saunaId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, clientId, saunaId);
    }
}
