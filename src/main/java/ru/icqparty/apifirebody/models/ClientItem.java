package ru.icqparty.apifirebody.models;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "client_items")
public class ClientItem {

    public static final int TYPE_ITEM_SAUNA = 0;
    public static final int TYPE_ITEM_HOTEL = 1;
    public static final int TYPE_ITEM_TAXI = 2;
    public static final int TYPE_ITEM_SPA = 3;

    public static final int STATUS_ITEM_NEW = 0;
    public static final int STATUS_ITEM_ACTIVE = 1;
    public static final int STATUS_ITEM_EXPIRIED = 2;

    public static final int ADV_ITEM_NONE = 0;
    public static final int ADV_ITEM_SIMPLE = 1;
    public static final int ADV_ITEM_PREMIUM = 2;


    @Id
    private String id;

    private String description;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;

    private LocalDateTime publishedAt;

    private int status;

    private int type;

    private int adv;
    @DBRef
    private Client client;
    @DBRef
    private City city;

    @GraphQLQuery(name = "id")
    public String getId() {
        return id;
    }

    @GraphQLQuery(name = "name")
    public String getName() {
        return name;
    }
}
