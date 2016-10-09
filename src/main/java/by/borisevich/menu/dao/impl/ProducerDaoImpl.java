package by.borisevich.menu.dao.impl;

import by.borisevich.menu.dao.ProducerDao;
import by.borisevich.menu.domain.Producer;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */
@Repository
public class ProducerDaoImpl extends GenericDaoImpl<Producer, Long> implements ProducerDao {

    public ProducerDaoImpl() {
        super(Producer.class);
    }

    ;

}
