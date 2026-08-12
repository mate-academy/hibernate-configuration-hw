package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Spider man: No way home");
        movie.setDescription("Is a 2021 American superhero film based on the Marvel"
                + " Comics character Spider-Man, co-produced by Columbia Pictures and "
                + "Marvel Studios and distributed by Sony Pictures Releasing.");
        movie = movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
