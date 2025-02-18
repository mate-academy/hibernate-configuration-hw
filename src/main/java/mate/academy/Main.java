package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Paddington");
        movie.setDescription("A young Peruvian bear travels to "
                + "London in search of a home. Finding himself lost and alone "
                + "at Paddington Station, he meets the kindly Brown family, who"
                + " offer him a temporary haven.");
        movieService.add(movie);

        movieService.get(1L);
    }
}
