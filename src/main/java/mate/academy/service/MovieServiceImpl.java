package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Dao
    private final MovieDao movieDao = (MovieDao) Injector
            .getInstance("mate.academy.dao").getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        if (movieDao.get(id).orElse(null) == null) {
            throw new DataProcessingException("The object at index " + id + " is null");
        }
        return movieDao.get(id).orElse(null);
    }
}
