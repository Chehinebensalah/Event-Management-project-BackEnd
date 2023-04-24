package web.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.event;
import web.demo.model.subscriber;

@Repository
public interface subscriberRepository extends CrudRepository<subscriber,String> {
}
