package mate.academy.service.impl;

import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@Inject
@Service
public class MovieServiceImpl implements MovieService {
    private static final MovieDaoImpl movieDaoImpl = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return movieDaoImpl.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDaoImpl.get(id).orElseThrow();
    }
}
