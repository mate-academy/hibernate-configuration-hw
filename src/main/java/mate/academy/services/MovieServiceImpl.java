package mate.academy.services;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieService;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.models.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Inject
    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public MovieServiceImpl() {
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(() ->
                new RuntimeException("Can't get movie by id" + id));
    }
}
