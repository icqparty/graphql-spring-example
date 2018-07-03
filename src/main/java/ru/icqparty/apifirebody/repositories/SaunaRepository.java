package ru.icqparty.apifirebody.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import ru.icqparty.apifirebody.models.Sauna;

public interface SaunaRepository extends MongoRepository<Sauna,String> {
}
