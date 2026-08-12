package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        Movie movie = new Movie();
        movie.setTitle("To Kill a Mockingbird");
        movie.setDescription("To Kill a Mockingbird description");

        // CREATE
        Movie createdMovie = movieDao.add(movie);
        System.out.println("CREATED: " + createdMovie);

        // FIND BY ID
        movieDao.get(createdMovie.getId())
                .ifPresent(el -> System.out.println("FOUND BY ID: " + el));
    }
}
