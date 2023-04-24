package web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.*;
import web.demo.service.eventService;
import web.demo.service.subscriberService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class subscriberController {

    @Autowired
    private subscriberService subscriberservice;

    @PostMapping("/subscriber/add")
    public subscriber createsubscriber(@RequestBody subscriber subscriber){
        subscriber subscriber1 = subscriberservice.createSubscriber(subscriber);
        return subscriber1;
    }
    @GetMapping("/subscriber/getall")
    public List<subscriber> getAllsubscribers(){
        return subscriberservice.getSubscribers();
    }

    @DeleteMapping("/subscriber/delete/{id}")
    public String deletesubscriber(@PathVariable("id") String id){
        subscriberservice.deleteSubscriber(id);
        return "admin deleted successfully";
    }
    @GetMapping("/subscriber/getsubscriberbyid/{id}")
    public subscriber getsubscriberbyid(@PathVariable("id") String id){
        return subscriberservice.getSubscriberbyId(id);
    }
}
