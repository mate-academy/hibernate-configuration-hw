package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    public MovieServiceImpl(MovieDao moveDao) {
        this.movieDao = moveDao;
    }

    public MovieServiceImpl() {
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Boolean update(Movie movie) {
        Movie currentMovie = get(movie.getId());
        movieDao.update(movie);
        return currentMovie.equals(get(movie.getId()));
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id)
                .orElseThrow(() -> new RuntimeException("there is no object with id: " + id));
    }

    @Override
    public Boolean delete(Long id) {
        return movieDao.delete(id);
    }
}
