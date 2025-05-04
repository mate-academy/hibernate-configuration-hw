package mate.academy.service;

import java.util.Optional;
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
        movie.setTitle(movie.getTitle() + " additional data processing in service Tier");
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movieGetOptional = movieDao.get(id);
        if (movieGetOptional.isEmpty()) {
            return null;
        }
        Movie movieProcessed = movieGetOptional.get();
        movieProcessed.setDescription(movieProcessed.getDescription()
                + " additional data processing in service Tier");
        return movieProcessed;
    }
}
