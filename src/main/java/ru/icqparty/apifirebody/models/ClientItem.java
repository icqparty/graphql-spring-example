package ru.icqparty.apifirebody.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Data
@Entity
public class ClientItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    public static final int STATUS_ITEM_NEW = 0;
    public static final int STATUS_ITEM_ACTIVE = 1;
    public static final int STATUS_ITEM_EXPIRIED = 2;

    public static final int ADV_ITEM_NONE = 0;
    public static final int ADV_ITEM_SIMPLE = 1;
    public static final int ADV_ITEM_PREMIUM = 2;


//    public static final int TYPE_ITEM_SAUNA = 0;
//    public static final int TYPE_ITEM_HOTEL = 1;
//    public static final int TYPE_ITEM_TAXI = 2;
//    public static final int TYPE_ITEM_SPA = 3;



    private String type;

    private String description;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;

    private LocalDateTime publishedAt;

    private int status;

    private int adv;
    private Client client;

    private City city;

}
