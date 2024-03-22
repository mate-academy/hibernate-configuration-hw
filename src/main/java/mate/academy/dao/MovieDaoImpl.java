package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Inject
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Inject
    private Session mySession = sessionFactory.openSession();

    @Override
    public Movie save(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (mySession != null) {
                mySession.close();
            }
        }

        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        mySession = sessionFactory.openSession();
        return Optional.ofNullable(mySession.get(Movie.class, id));
    }
}
