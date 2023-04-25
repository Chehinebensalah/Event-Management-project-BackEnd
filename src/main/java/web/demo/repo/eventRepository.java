package web.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.event;

import java.util.List;

@Repository
public interface eventRepository extends CrudRepository<event,Integer> {

    @Query(value="SELECT * FROM event e WHERE e.Byadmin =?1 ",nativeQuery=true)
    public List<event> getEventsbyAdminId(Integer id);

}
