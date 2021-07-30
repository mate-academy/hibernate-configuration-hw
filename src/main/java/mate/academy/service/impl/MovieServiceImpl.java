package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao carDao;

    @Override
    public Movie add(Movie movie) {
        return carDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return carDao.get(id).get();
    }
}
