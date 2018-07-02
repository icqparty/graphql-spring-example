package ru.icqparty.apifirebody.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Data
@Entity
public class Sauna extends ClientItem {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private List<String> phones;

    private List<SaunaHall> halls;

    private String address;


}
