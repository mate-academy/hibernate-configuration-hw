package mate.academy.service;

import java.util.NoSuchElementException;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        if (movie.getTitle() == null || movie.getTitle().isEmpty()
                || movie.getDescription() == null || movie.getDescription().isEmpty()) {
            throw new IllegalArgumentException("Title and description are required");
        }
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("id is required");
        }
        return movieDao.get(id).orElseThrow(
                () -> new NoSuchElementException("Movie with id " + id + " not found")
        );
    }
}
