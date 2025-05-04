package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.DataProcessingException;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    public MovieServiceImpl() {
    }

    public void setMovieDao(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(()
                -> new DataProcessingException("Movie with id "
                + id
                + " not found"));
    }
}
