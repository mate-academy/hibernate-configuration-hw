package mate.academy.lib.service;

import mate.academy.lib.Inject;
import mate.academy.lib.dao.MovieDao;
import mate.academy.lib.model.Movie;

public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new RuntimeException("Can not get movie by id: " + id));
    }
}
