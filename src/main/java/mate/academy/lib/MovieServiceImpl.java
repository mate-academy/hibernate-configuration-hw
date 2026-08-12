package mate.academy.lib;

import java.util.Optional;

public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        Movie savedMovie = movieDao.add(movie);
        return savedMovie;
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> optionalMovie = movieDao.get(id);
        if (optionalMovie.isPresent()) {
            return optionalMovie.get();
        }
        throw new DataProcessingException("This movie is not find");
    }
}
