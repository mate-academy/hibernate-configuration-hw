package mate.academy.service;

import mate.academy.DataProcessingException;
import mate.academy.Movie;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao;

    MovieServiceImpl(final MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(() ->
                new DataProcessingException("There's no movie with this id"));
    }
}
