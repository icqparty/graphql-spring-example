package ru.icqparty.apifirebody.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data

@Document(collection = "adv_options")
public class AdvsOptions {
    private int id;
    private String name;
    private String value;
    private Integer advId;


}
