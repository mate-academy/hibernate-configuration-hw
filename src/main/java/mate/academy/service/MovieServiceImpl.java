package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao moveDao;

    public MovieServiceImpl(MovieDao moveDao) {
        this.moveDao = moveDao;
    }

    public MovieServiceImpl() {
    }

    @Override
    public Movie add(Movie movie) {
        return moveDao.add(movie);
    }

    @Override
    public Boolean update(Movie movie) {
        Movie currentMovie = get(movie.getId());
        moveDao.update(movie);
        return currentMovie.equals(get(movie.getId()));
    }

    @Override
    public Movie get(Long id) {
        return moveDao.get(id)
                .orElseThrow(() -> new RuntimeException("there is no object with id: " + id));
    }

    @Override
    public Boolean delete(Long id) {
        return moveDao.delete(id);
    }
}
