package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Lord of the Rings");
        movie.setDescription("Legendary movie that was shot according "
                + "to the book of J. R. R. Tolkien");

        Movie addedMovie = movieService.add(movie);
        System.out.println("Movie has been successfully added to DB. "
                + "Movie: " + addedMovie);

        Movie recievedMovie = movieService.get(addedMovie.getId());
        System.out.println("Movie has been successfully received from DB "
                + "by id: " + recievedMovie.getId());
    }
}
