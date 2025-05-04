package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");
    private MovieDao movieDao = (MovieDao) INJECTOR.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(() -> new DataProcessingException(String.format(
                "There is no movie by ID %s in the db", id)));
    }
}
