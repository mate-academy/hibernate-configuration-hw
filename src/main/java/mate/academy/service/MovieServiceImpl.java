package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao = (MovieDao) Injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElse(null);
    }
}
