package ru.icqparty.apifirebody.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Document(collection = "advs")
public class Adv {
    private int id;
    private Integer objectId;
    private Timestamp createdAt;
    private Timestamp updateAt;
    private Timestamp deletedAt;

    private Set<AdvsOptions> options;


}
