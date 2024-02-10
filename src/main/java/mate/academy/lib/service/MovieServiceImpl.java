package mate.academy.lib.service;

import mate.academy.lib.Service;
import mate.academy.lib.dao.MovieDaoImpl;
import mate.academy.lib.exception.DataProcessingException;
import mate.academy.lib.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieDaoImpl movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        if (movieDao.get(id).isPresent()) {
            return movieDao.get(id).get();
        } else {
            throw new DataProcessingException("Movie with id " + id + " not found");
        }
    }
}
