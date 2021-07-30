package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Gentlemen");
        movie.setDescription("An American expat tries to sell off his highly profitable"
                + " marijuana empire in London, triggering plots, schemes, bribery "
                + "and blackmail in an attempt to steal his domain out from under him.");
        movieService.add(movie);

        System.out.println(movieService.get(1L).toString());
    }
}
