package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao md = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return md.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return md.get(id).orElseThrow(() -> new RuntimeException("Cant get movie from DB"));
    }
}
