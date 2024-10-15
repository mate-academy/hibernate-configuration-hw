package mate.academy.service;

import mate.academy.dao.DataProcessingException;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        movieDao.addMovie(movie);
        return movie;
    }

    @Override
    public Movie get(int id) {
        return movieDao.get(id).orElseThrow(()
                -> new DataProcessingException("Movie with ID: " + id + " not found."));
    }
}
