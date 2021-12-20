package mate.academy.sirvice.movie;

import mate.academy.dao.movie.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }
}
