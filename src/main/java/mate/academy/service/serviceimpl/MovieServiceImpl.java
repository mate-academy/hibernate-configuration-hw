package mate.academy.service.serviceimpl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.daoimpl.MovieDaoImpl;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        movieDao.add(movie);
        return movie;
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movie = movieDao.get(id);
        return movie.orElseThrow(() -> new RuntimeException("Movie not found with ID: " + id));
    }
}
