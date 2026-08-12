package mate.academy.services;

import mate.academy.dao.MovieDao;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final String CANNOT_GET_MOVIE_BY_ID_MESSAGE_TEMPLATE
            = "Cannot get a movie by this id: ";

    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new DataProcessingException(CANNOT_GET_MOVIE_BY_ID_MESSAGE_TEMPLATE));
    }
}
