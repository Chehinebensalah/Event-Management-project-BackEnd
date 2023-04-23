package web.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.event;

@Repository
public interface eventRepository extends CrudRepository<event,Integer> {
}
