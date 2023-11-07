package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDao movieDao;

    public MovieServiceImpl() {
    }

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        if (movie.getId() != null) {
            throw new RuntimeException("New movie must have ID with null value.");
        }
        return movieDao.add(movie);
    }

    @Override
    public Movie get(final Long id) {
        return movieDao.get(id)
                .orElseThrow(() -> new RuntimeException("Movie with ID: " + id + " not found")
        );
    }
}
