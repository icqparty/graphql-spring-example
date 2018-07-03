package ru.icqparty.apifirebody.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cities")
@AllArgsConstructor
@NoArgsConstructor
public class City {


    @Id
    private String id;

    private String name;

    private String region;

    private String district;

    private Coords coords;

    private String population;



}
