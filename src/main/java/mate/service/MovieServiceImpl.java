package mate.service;

import mate.dao.MovieDao;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Movie;

@Service
public class MovieServiceImpl implements MovieService{
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(() ->
                new RuntimeException("Can't get movie from DB id = " + id));
    }
}
