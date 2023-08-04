package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Oppenheimer");
        movie.setDescription("Now I'm become Death, the destroyer of Worlds");
        MovieDao movieDao = new MovieDaoImpl();
        movieDao.add(movie);
        System.out.println(movieDao.get(1L));

    }
}
