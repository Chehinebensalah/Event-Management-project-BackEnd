package web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.*;
import web.demo.service.eventService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class eventController {

    @Autowired
    private eventService eventservice;

    @PostMapping("/event/add")
    public event createEvent(@RequestBody event Event){
        event Event1 = eventservice.createEvent(Event);
        return Event1;
    }
    @GetMapping("/event/getall")
    public List<event> getAllEvents(){
        return eventservice.getEvents();
    }
    @PutMapping("/event/update/{id}")
    public event updateEventbyid(@RequestBody event Event,@PathVariable("id") Integer id){
        return  eventservice.updateEvent(Event,id);
    }
    @DeleteMapping("/event/delete/{id}")
    public String deleteevent(@PathVariable("id") Integer id){
        eventservice.deleteEvent(id);
        return "admin deleted successfully";
    }
    @GetMapping("/event/geteventbyid/{id}")
    public event getEventbyid(@PathVariable("id") Integer id){
        return eventservice.getEventbyId(id);
    }

    @GetMapping("/event/geteventbyidadmin/{id}")
    public List<event> getEvenetsByIdAdmin(@PathVariable("id") Integer id){
        return eventservice.eventsbyIdadmin(id);
    }

}
