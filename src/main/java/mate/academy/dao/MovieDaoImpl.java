package mate.academy.dao;

import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie save(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try{
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null) {
                transaction.rollback();
            }
                throw new RuntimeException("Can't save movie to DB", e);
        } finally {
            if(session != null){
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Movie get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        try {
             session = sessionFactory.openSession();
            return  session.get(Movie.class, id);
        } catch (Exception e){
            throw new RuntimeException("Can't get movie by id: " + id);
        }
    }
}
