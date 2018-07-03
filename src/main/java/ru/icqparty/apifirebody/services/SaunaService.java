package ru.icqparty.apifirebody.services;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import ru.icqparty.apifirebody.models.Sauna;
import ru.icqparty.apifirebody.repositories.SaunaRepository;

import java.util.List;
import java.util.Map;

@Component
public class SaunaService {

    @Autowired
    private SaunaRepository saunaRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GraphQLQuery(name = "search")
    public List<Sauna> search(@GraphQLArgument(name = "page") Integer page,@GraphQLArgument(name = "filters") Map<String,String> filters) {

        Query query = new Query();

        if(filters.containsKey("id")){
            query.addCriteria(Criteria.where("id").is(filters.get("id")));
        }

        if(filters.containsKey("city")){
            query.addCriteria(Criteria.where("city.id").is(filters.get("city")));
        }

        System.out.println(filters.toString());

        List<Sauna> result = mongoTemplate.find(query, Sauna.class);

        return  result;
    }


    @GraphQLQuery(name = "sauna")
    public Sauna getById(@GraphQLArgument(name = "id") String id ) {
        return  saunaRepository.findById(id).get();
    }
}
