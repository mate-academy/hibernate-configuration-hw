package mate.academy.services;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.models.Movie;

@Service
public class MovieServiceImpl implements  MovieService{
    @Override
    public Movie add(Movie movie) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie movieAddedToDB = movieDao.add(movie);
        return movieAddedToDB;
    }

    @Override
    public Movie get(Long id) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie movieFromDB = movieDao.get(id).get();
        return movieFromDB;
    }
}
