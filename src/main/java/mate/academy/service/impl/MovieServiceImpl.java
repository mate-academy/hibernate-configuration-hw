package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.dao.moviedaoimpl.MovieDaoImpl;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElse(new Movie());
    }
}
