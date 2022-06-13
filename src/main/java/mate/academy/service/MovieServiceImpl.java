package mate.academy.service;

import java.util.List;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private final MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie element) {
        return movieDao.add(element);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }

    @Override
    public Movie update(Movie element) {
        return movieDao.update(element);
    }

    @Override
    public boolean delete(Long id) {
        return movieDao.delete(id);
    }
}
