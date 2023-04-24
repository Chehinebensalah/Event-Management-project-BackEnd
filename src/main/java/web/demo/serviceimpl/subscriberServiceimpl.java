package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.model.subscriber;
import web.demo.repo.subscriberRepository;
import web.demo.service.subscriberService;

import java.util.List;


@Service
public class subscriberServiceimpl implements subscriberService {
    @Autowired
    private subscriberRepository subscriberrepository;
    @Override
    public subscriber createSubscriber(subscriber sb) {
        return subscriberrepository.save(sb);
    }

    @Override
    public List<subscriber> getSubscribers() {
        return ((List<subscriber>) subscriberrepository.findAll());
    }

    @Override
    public subscriber getSubscriberbyId(String id) {
        return subscriberrepository.findById(id).get();
    }

    @Override
    public void deleteSubscriber(String id) {
        subscriberrepository.deleteById(id);
    }


}
