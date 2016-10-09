package by.borisevich.menu.service.impl;

import by.borisevich.menu.dao.ProducerDao;
import by.borisevich.menu.domain.Producer;
import by.borisevich.menu.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 7/31/16.
 */
@Service
public class ProducerServiceImpl extends GenericServiceImpl<Producer, Long> implements ProducerService {

    @Autowired
    public ProducerServiceImpl(ProducerDao dao) {
        super(dao);
    }

}
