package ru.icqparty.apifirebody.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import ru.icqparty.apifirebody.models.User;

public interface UserRepository extends MongoRepository<User,String> {
}
