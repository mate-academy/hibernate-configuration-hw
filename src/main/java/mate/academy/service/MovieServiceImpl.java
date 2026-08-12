package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Dao;
import mate.academy.lib.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
@Dao
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) throws DataProcessingException {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.get(id).orElse(null);
    }
}
