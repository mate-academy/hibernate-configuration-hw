package mate.academy.service.impl;

import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.dao.MovieDao;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movie = movieDao.get(id);
        if (movie.isEmpty()) {
            throw new RuntimeException("Movie with id " + id + " not found");
        }
        return movie.get();
    }
}