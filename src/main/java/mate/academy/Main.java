package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie("Forest Gump", "Comedy drama");
        movieService.add(movie);
        System.out.println("Added new movie in to DB. Movie: " + movie);
        Movie getMoveById = movieService.get(movie.getId());
        System.out.println("Get movie by ID from DB. ID: " + movie.getId()
                + " Movie: " + getMoveById);
    }
}
