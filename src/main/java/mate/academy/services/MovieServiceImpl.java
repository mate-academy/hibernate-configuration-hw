package mate.academy.services;

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
        if (movie == null) {
            throw new RuntimeException("movie can't be null");
        }
        movieDao.add(movie);
        return movie;
    }

    @Override
    public Movie get(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("id can't be null");
        }

        movieDao.get(id);
        return movieDao.get(id)
                .orElseThrow(
                        () -> new IllegalArgumentException(
                                "Movie with id : " + id
                                + " was not found."
                        )
                );
    }
}
