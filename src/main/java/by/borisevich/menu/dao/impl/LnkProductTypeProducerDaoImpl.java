package by.borisevich.menu.dao.impl;

import by.borisevich.menu.dao.LnkProductTypeProducerDao;
import by.borisevich.menu.domain.LnkProductTypeProducer;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */
@Repository
public class LnkProductTypeProducerDaoImpl extends GenericDaoImpl<LnkProductTypeProducer, Long> implements LnkProductTypeProducerDao {

    public LnkProductTypeProducerDaoImpl() {
        super(LnkProductTypeProducer.class);
    }

    ;

}
