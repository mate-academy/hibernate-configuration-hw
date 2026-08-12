package mate.academy.service;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDaoImpl daoImpl;

    @Override
    public Movie add(Movie movie) {
        return daoImpl.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return daoImpl.get(id).orElseThrow();
    }
}
