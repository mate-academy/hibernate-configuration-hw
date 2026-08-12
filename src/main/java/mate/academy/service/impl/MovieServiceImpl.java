package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private static MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        if (id == null || id < 1) {
            throw new IllegalArgumentException("id can't be null or less than 0");
        }
        return movieDao.get(id).orElseThrow(() -> new DataProcessingException(
                "Can't get movie by id " + id));
    }
}
