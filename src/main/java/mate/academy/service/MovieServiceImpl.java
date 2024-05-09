package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Dao;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import java.util.Optional;

@Service
@Dao
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.add(movie);
    }

    @Override
    public Optional<Movie> get(Long id) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.get(id);
    }
}
