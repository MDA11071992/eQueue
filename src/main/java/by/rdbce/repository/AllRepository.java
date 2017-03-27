package by.rdbce.repository;

/**
 * Created by malabar on 3/26/17.
 */
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AllRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List listTickets() {
        return this.sessionFactory.getCurrentSession().createQuery("from tickets").list();
    }

}

