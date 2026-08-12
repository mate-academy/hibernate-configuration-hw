package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao dao;

    @Override
    public Movie add(Movie movie) {
        return dao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movie = dao.get(id);
        if (movie.isEmpty()) {
            throw new DataProcessingException("Can't get info by id: " + id);
        }
        return movie.get();
    }
}
