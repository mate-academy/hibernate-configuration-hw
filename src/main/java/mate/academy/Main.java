package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
       MovieDao movieDao = new MovieDaoImpl();
        movieDao.get(1L);

        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Terminator 5");
        movie.setDescription("Awesome movie");

        movieDao.add(movie);
    }
}
