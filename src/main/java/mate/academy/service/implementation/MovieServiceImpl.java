package mate.academy.service.implementation;

import lombok.AllArgsConstructor;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@AllArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private final MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }
}
