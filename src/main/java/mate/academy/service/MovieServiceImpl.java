package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDao movieDao;

    @Service
    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Service
    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElse(null);
    }
}
