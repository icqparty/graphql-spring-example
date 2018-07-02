package ru.icqparty.apifirebody.models;

import io.leangen.graphql.annotations.GraphQLQuery;

import java.util.Date;

public class Company {

    private String name;
    private Integer id;
    private Date registrationDate;

    @GraphQLQuery(name = "name", description = "A person's name")
    public String getName() {
        return name;
    }

    @GraphQLQuery(name = "id", description = "A person's id")
    public Integer getId() {
        return id;
    }

    @GraphQLQuery(name = "regDate", description = "Date of registration")
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
