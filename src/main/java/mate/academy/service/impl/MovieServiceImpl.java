package mate.academy.service.impl;

import java.util.NoSuchElementException;
import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.entity.Movie;
import mate.academy.lib.Service;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(NoSuchElementException::new);
    }
}
