package mate.academy.services;

import mate.academy.dao.MovieDao;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        if (movie == null || movie.getDescription() == null || movie.getTitle() == null) {
            throw new DataProcessingException("The argument (a movie) or his fields is null :"
                    + movie);
        }
        if (movie.getId() != null) {
            throw new DataProcessingException("Incorrect operation, the movie already has an Id: "
                    + movie);
        }
        Movie addedMoved = movieDao.add(movie);
        if (addedMoved.getId() == null) {
            throw new DataProcessingException("The error when adding movie, the Id is missing. "
                    + addedMoved);
        }
        return addedMoved;
    }

    @Override
    public Movie get(Long id) {
        if (id == null) {
            throw new DataProcessingException("The argument (an Id) is null.");
        }
        return movieDao.get(id).orElseThrow(()
                -> new DataProcessingException("The error when getting movie by Id: " + id
                + ", a movie is missing."));
    }
}
