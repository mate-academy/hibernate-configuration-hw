package mate.academy.service;

import mate.academy.dao.DataProcessingException;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) throws DataProcessingException {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) throws DataProcessingException {
        return movieDao.get(id).get();
    }
}