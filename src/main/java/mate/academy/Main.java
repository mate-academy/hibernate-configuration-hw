package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector
            = Injector.getInstance("mate.academy");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Shawshank Redemption");
        movie.setDescription("Over the course of several years, two convicts form a friendship,"
                + " seeking consolation and, eventually, redemption through basic compassion.");
        movieService.add(movie);
        System.out.println("Movie number one:" + movieService.get(1L));
    }
}
