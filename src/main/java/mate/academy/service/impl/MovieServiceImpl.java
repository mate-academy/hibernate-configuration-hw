package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService{
    private static final Injector injector = Injector.getInstance("mate.academy");
    private MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }
}
