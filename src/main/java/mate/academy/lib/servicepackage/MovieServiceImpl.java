package mate.academy.lib.servicepackage;

import mate.academy.lib.Inject;
import mate.academy.lib.Movie;
import mate.academy.lib.Service;
import mate.academy.lib.daopackage.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(() ->
        new RuntimeException("Could not find movie with id " + id));
    }
}
