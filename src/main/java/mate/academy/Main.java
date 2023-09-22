package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setDescription("description");
        movie.setTitle("title");
        movieDao.add(movie);
        movieDao.get(1L);

    }
}
