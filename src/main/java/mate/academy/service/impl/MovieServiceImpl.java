package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class MovieServiceImpl implements MovieService {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private final MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id)
                    .orElseThrow(() -> new DataProcessingException(
                            String.format("Not found by id - %s", id)));
    }
}
