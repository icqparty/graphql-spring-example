package ru.icqparty.apifirebody.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
public class AdvsOptions {

    private String name;
    private String value;

}
