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
        mySession = null;
        Transaction transaction = null;

        try {
            transaction = mySession.beginTransaction();
            mySession.save(movie);
            transaction.commit();

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
