package ru.icqparty.apifirebody.services;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Component;
import ru.icqparty.apifirebody.models.Users;

@Component
public class SaunaService {


    @GraphQLQuery(name = "company")
    public Users getById(@GraphQLArgument(name = "id") Integer id) {
        Users user=  new Users();
        user.setUsername("ssss");

      return user;
    }



}
