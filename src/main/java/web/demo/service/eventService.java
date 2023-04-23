package web.demo.service;

import org.springframework.stereotype.Service;
import web.demo.model.admin;
import web.demo.model.event;

import java.util.List;

@Service
public interface eventService {
    public event createEvent(event ev);

    public List<event> getEvents();

    public event getEventbyId(Integer id);
    public void deleteEvent(Integer id);

    public event updateEvent(event ev , Integer id);
}
