package ru.icqparty.apifirebody.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Clients {
    private int id;
    private Integer userId;
    private String fullname;
    private String phone;
    private String address;
    private String inn;
    private String ogrn;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "fullname", nullable = true, length = 255)
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "inn", nullable = true, length = 255)
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "ogrn", nullable = true, length = 255)
    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return id == clients.id &&
                Objects.equals(userId, clients.userId) &&
                Objects.equals(fullname, clients.fullname) &&
                Objects.equals(phone, clients.phone) &&
                Objects.equals(address, clients.address) &&
                Objects.equals(inn, clients.inn) &&
                Objects.equals(ogrn, clients.ogrn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, fullname, phone, address, inn, ogrn);
    }

    private Saunas oneToOne;

    @OneToOne
    public Saunas getOneToOne() {
        return oneToOne;
    }

    public void setOneToOne(Saunas oneToOne) {
        this.oneToOne = oneToOne;
    }
}
