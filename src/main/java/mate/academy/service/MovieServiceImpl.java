package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.lib.Dao;

@Dao
public class MovieServiceImpl implements MovieService {
    static final Injector injector = Injector.getInstance("mate.academy");
    static final MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }
}
