package ru.icqparty.apifirebody.services;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Component;
import ru.icqparty.apifirebody.models.User;

@Component
public class UserService {


    @GraphQLQuery(name = "users")
    public User getById(@GraphQLArgument(name = "id") Integer id) {
        User user=  new User();
        user.setUsername("ssss");

      return user;
    }



}
