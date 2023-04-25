package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.model.admin;
import web.demo.model.event;
import web.demo.repo.adminRepository;
import web.demo.repo.eventRepository;
import web.demo.service.eventService;

import java.util.List;


@Service
public class eventServiceimpl implements eventService {
    @Autowired
    private eventRepository eventrrepository;
    @Override
    public event createEvent(event ev) {
        return eventrrepository.save(ev);
    }

    @Override
    public List<event> getEvents() {
        return ((List<event>) eventrrepository.findAll());
    }

    @Override
    public event getEventbyId(Integer id) {
        return eventrrepository.findById(id).get();
    }
    @Override
    public List<event> eventsbyIdadmin(Integer id){
        return eventrrepository.getEventsbyAdminId(id);
    }


    @Override
    public void deleteEvent(Integer id) {
        eventrrepository.deleteById(id);
    }

    @Override
    public event updateEvent(event ev, Integer id) {
        event Event = eventrrepository.findById(id).get();
        Event.setId_event(ev.getId_event());
        Event.setName(ev.getName());
        Event.setCategorie(ev.getCategorie());
        Event.setDate_debut(ev.getDate_debut());
        Event.setDate_fin(ev.getDate_fin());
        Event.setByadmin(ev.getByadmin());
        return eventrrepository.save(Event);
    }
}
