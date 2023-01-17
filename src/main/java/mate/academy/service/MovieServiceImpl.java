package mate.academy.service;

import java.util.NoSuchElementException;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;

public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id)
                .orElseThrow(()
                        -> new NoSuchElementException("Can't find movie by id: " + id));
    }
}
