package ru.icqparty.apifirebody.models;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


@Data
public class SaunaHall {

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
