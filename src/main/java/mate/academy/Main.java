package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Lady hawk");
        movie.setDescription("Lady hawke is a 1985 American medieval fantasy film directed"
                + "and produced by Richard Donner and starring Matthew Broderick, "
                + "Rutger Hauer and Michelle Pfeiffer");

        Movie ladyHawk = movieService.add(movie);

        System.out.println(movieService.get(ladyHawk.getId()));
    }
}
