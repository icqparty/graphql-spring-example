package ru.icqparty.apifirebody.services;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.icqparty.apifirebody.models.Company;

@Component
public class CompanyService {


    @GraphQLQuery(name = "company")
    public Company getById(@GraphQLArgument(name = "id") Integer id) {
        Company company=  new Company();
        company.setName("ssss");
        company.setId(23);

      return company;
    }

}
