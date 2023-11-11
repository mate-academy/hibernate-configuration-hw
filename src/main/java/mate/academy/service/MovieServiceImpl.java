package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class MovieServiceImpl implements MovieService {
    private static final MovieDao MOVIE_DAO = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        MOVIE_DAO.add(movie);
        return movie;
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movie = MOVIE_DAO.get(id);
        return movie.orElseThrow();
    }
}
