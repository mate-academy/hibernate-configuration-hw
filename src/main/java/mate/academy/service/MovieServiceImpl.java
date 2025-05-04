package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Injector injector = Injector.getInstance("mate.academy");

    @Override
    public Movie add(Movie movie) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        Movie movie = new Movie();
        try {
            movie = movieDao.get(id).get();
        } catch (Exception e) {
            throw new DataProcessingException("Movie with id " + id + "dosen't exist in the "
                    + "database", e);
        }
        return movie;
    }
}
