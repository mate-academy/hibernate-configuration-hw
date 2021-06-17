package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.lib.Dao;

@Dao
public class MovieServiceImpl implements MovieService {
    @Inject
    MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }
}
