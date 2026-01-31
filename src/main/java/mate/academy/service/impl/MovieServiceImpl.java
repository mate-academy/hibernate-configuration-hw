package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDao movieDao;

    @Inject
    private SessionFactory sessionFactory;

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            movieDao.add(movie);

            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new RuntimeException("Movie not found id=" + id)
        );
    }
}
