package ru.icqparty.apifirebody.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.icqparty.apifirebody.models.Saunas;
import ru.icqparty.apifirebody.models.Users;

public interface SaunaRepository extends CrudRepository<Saunas,String> {
}
