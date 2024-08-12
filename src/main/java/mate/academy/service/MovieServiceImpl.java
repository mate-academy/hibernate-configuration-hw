package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDaoImpl movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> optionalMovie = movieDao.get(id);
        return optionalMovie.get();
    }
}
