package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Fight Club");
        movie.setDescription("Unhappy with his capitalistic lifestyle, "
                + "a white-collared insomniac forms an underground fight club with Tyler, "
                + "a careless soap salesman. Soon, their venture spirals down "
                + "into something sinister.");
        Movie savedMovie = movieService.add(movie);
        System.out.println(savedMovie);
        System.out.println(movieService.get(1L));
    }
}
