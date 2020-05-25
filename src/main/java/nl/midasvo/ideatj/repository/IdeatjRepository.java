package nl.midasvo.ideatj.repository;

import nl.midasvo.ideatj.entity.Ideatj;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface IdeatjRepository extends CrudRepository<Ideatj, Long> {
}
