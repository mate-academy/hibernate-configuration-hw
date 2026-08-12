package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector
                .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Terminator 1");
        movie.setDescription("Action movie.");
        movieService.add(movie);
        Movie movieTest = new Movie();
        movieTest = movieService.get(1L);
        System.out.printf("Title:", movieTest.getTitle());
        System.out.printf("Description:", movieTest.getDescription());

    }
}
