package ru.icqparty.apifirebody.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@Entity
public class Adv {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private ClientItem sss;

    private Map<String,Object> options;

    private Integer type;
    private Integer status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
