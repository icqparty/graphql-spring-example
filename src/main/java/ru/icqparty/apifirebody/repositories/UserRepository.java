package ru.icqparty.apifirebody.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.icqparty.apifirebody.models.Users;

public interface UserRepository extends CrudRepository<Users,String> {
}
