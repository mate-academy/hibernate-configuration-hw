package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Dao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;

@Dao
public class MovieServiceImpl implements MovieService {
    @Inject
    private final MovieDao movieDao;

    public MovieServiceImpl() {
        this.movieDao = new MovieDaoImpl();
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(() -> new RuntimeException("There is no movie by id "
                + id + " in the database"));
    }
}
