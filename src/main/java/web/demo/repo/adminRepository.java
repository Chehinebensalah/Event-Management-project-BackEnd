package web.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.*;

import java.util.List;

@Repository
public interface adminRepository extends CrudRepository<admin,Integer> {
    List<admin> findByMail(String mail);

}
