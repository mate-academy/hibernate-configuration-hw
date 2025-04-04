package mate.academy.services;

import java.util.Optional;

import mate.academy.DataProcessingException;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao dao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        dao.add(movie);
        return movie;
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movie = dao.get(id);
        if (movie.isEmpty()) {
            throw new DataProcessingException("There is no movie", new RuntimeException());
        }
        return movie.orElse(null);
    }
}
