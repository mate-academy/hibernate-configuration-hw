package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.domain.Movie;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }
}
