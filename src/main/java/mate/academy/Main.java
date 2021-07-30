package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Tomorrow War");
        movie.setDescription("In December 2022, biology teacher and former "
                + "Green Beret Dan Forester fails to get a "
                + "job at a prestigious research center.");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
