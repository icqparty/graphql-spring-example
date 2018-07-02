package ru.icqparty.apifirebody.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
public class SaunaHall {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;
    private String restroom;
    private String capacity;
    private String description;
    private String description_extra;
    private String service;
    private String pool;

    private String price_hour;
    private List<String> images;

    private List<String> pairs;

    private LocalDateTime crearedAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;


}
