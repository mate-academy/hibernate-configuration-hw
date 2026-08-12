package mate.academy.lib.service.impl;

import java.util.Optional;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.lib.dao.MovieDao;
import mate.academy.lib.model.Movie;
import mate.academy.lib.service.MovieService;

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
        return movie.orElse(null);
    }
}
