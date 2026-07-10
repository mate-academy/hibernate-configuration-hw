package mate.academy.dao;

import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Optional;

public class MovieDaoImpl implements MovieDao {


    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
        } catch (Exception e) {
            if (transaction != null){
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        return Optional.empty();
    }
}
