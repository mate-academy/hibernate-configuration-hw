package mate.academy.service;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDaoImpl movieDao;

    public MovieServiceImpl(MovieDaoImpl movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Movie movie = movieDao.get(id).get();
        return movie;
    }
}
