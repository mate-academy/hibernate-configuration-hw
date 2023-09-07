package mate.academy.services;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private static final MovieDao MOVIE_DAO = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return MOVIE_DAO.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return MOVIE_DAO.get(id).orElseThrow(() ->
                new RuntimeException("Can`t find movie with id: " + id));
    }
}
