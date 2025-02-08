package mate.academy.model;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow();
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }
}
