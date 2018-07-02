package ru.icqparty.apifirebody.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.icqparty.apifirebody.models.Sauna;
import ru.icqparty.apifirebody.models.User;

public interface SaunaRepository extends CrudRepository<Sauna,String> {
}
