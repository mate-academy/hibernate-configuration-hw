package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        if (movie == null) {
            throw new DataProcessingException("go fuck your self");
        }
        movieDao.add(movie);
        return movie;
    }

    @Override
    public Movie get(Long id) {
        if (id == null) {
            throw new DataProcessingException("go fuck your self");
        }
        return movieDao.get(id).orElseThrow(DataProcessingException::new);
    }
}
