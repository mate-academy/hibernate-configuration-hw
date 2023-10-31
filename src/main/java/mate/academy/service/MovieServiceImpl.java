package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao dao;

    @Override
    public Movie add(Movie movie) {
        return dao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return dao.get(id).get();
    }
}
