package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("JAVA JUNIOR DEVELOPER");
        movie.setDescription("IN GENERAL ROLE: OLEG RAVLYK");
        MovieDao movieDao = new MovieDaoImpl();
        movieDao.add(movie);
        System.out.println(movie.getId());
    }
}
