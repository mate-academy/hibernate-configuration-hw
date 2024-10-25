package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Injector injector = Injector
            .getInstance("mate.academy");
    private static final MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        if (movieDao.get(id).isEmpty()) {
            throw new DataProcessingException("Book not found with id:" + id);
        }
        return movieDao.get(id).get();
    }
}
