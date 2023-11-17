package mate.academy;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Long id = (Long) session.save(movie);
            transaction.commit();
            movie.setId(id);
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Error adding movie to the database", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Error getting movie from the database", e);
        }
    }
}
