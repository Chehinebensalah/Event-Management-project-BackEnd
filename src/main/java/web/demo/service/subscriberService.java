package web.demo.service;

import org.springframework.stereotype.Service;
import web.demo.model.subscriber;

import java.util.List;

@Service
public interface subscriberService {
    public subscriber createSubscriber(subscriber sb);

    public List<subscriber> getSubscribers();

    public subscriber getSubscriberbyId(String id);

    public void deleteSubscriber(String id);

}
