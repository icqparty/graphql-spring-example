package ru.icqparty.apifirebody.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "clients")
public class Client {


    @Id
    private String id;
    private String name;
    private String description;

    private List<String> phones;

    private String site;
    private String email;

    @DBRef
    private City city;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    @DBRef
    private User user;

}
