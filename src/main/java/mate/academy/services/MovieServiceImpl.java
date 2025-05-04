package mate.academy.services;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie element) {
        return movieDao.add(element);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }
}
