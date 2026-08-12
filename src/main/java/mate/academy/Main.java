package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Fast & Furious");
        movie.setDescription("Fast & Furious, also known as The Fast and the Furious, "
                + "is a media franchise centered on a series of action films that "
                + "are largely concerned with street racing, heists, spies, and family.");
        movieService.add(movie);

        Movie testMovie = movieService.get(movie.getId());
        System.out.println("Movie: " + testMovie.getTitle()
                + System.lineSeparator()
                + "Description: " + testMovie.getDescription());
    }
}
