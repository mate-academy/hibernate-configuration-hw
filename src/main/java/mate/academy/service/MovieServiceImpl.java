package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return null;
    }
}
