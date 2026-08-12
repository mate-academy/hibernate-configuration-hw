package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        movieDao.add(Movie.builder().title("Shining").build());
        movieDao.add(Movie.builder().title("Carnival").build());
        movieDao.add(Movie.builder().title("Dark tower").build());
    }
}
