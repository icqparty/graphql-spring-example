package ru.icqparty.apifirebody.models;

import lombok.Data;

import java.util.List;

@Data
public class Sauna extends ClientItem {

    private List<String> phones;

    private List<SaunaHall> halls;

    private String address;


}
