package ru.icqparty.apifirebody.services;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.icqparty.apifirebody.models.Sauna;
import ru.icqparty.apifirebody.repositories.SaunaRepository;

import java.util.List;
import java.util.Map;

@Component
public class SaunaService {

    @Autowired
    private SaunaRepository saunaRepository;

    @GraphQLQuery(name = "saunaSearch")
    public List<Sauna> search(@GraphQLArgument(name = "page") Integer page,@GraphQLArgument(name = "filters") Map<String,String> filters) {

        return  saunaRepository.findAll();
    }


    @GraphQLQuery(name = "sauna")
    public Sauna getById(@GraphQLArgument(name = "id") String id ) {
        return  saunaRepository.findById(id).get();
    }
}
