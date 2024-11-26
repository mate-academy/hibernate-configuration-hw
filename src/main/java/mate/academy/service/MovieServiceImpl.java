package mate.academy.service;

import mate.academy.dao.MoveDao;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private final MoveDao moveDao;

    public MovieServiceImpl(MoveDao moveDao) {
        this.moveDao = moveDao;
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
