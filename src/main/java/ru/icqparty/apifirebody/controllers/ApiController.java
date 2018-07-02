package ru.icqparty.apifirebody.controllers;


import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import io.leangen.graphql.GraphQLSchemaGenerator;
import io.leangen.graphql.metadata.strategy.query.AnnotatedResolverBuilder;
import io.leangen.graphql.metadata.strategy.query.PublicResolverBuilder;
import io.leangen.graphql.metadata.strategy.value.jackson.JacksonValueMapperFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.icqparty.apifirebody.models.Company;
import ru.icqparty.apifirebody.services.CompanyService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ApiController {

    @Autowired
    private CompanyService companyService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    private  GraphQL graphQL;



    @PostMapping(value = "/graphql", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String, Object> indexFromAnnotated(@RequestBody Map<String, String> request, HttpServletRequest raw) {
        GraphQLSchema schema = new GraphQLSchemaGenerator()
                .withBasePackages("ru.icqparty.apifirebody")
                .withOperationsFromSingleton(companyService)
                .generate();
        graphQL = GraphQL.newGraphQL(schema).build();




        ExecutionResult executionResult = graphQL.execute(ExecutionInput.newExecutionInput()
                .query(request.get("query"))
                .operationName(request.get("operationName"))
                .context(raw)
                .build());
        return executionResult.toSpecification();
    }
}
