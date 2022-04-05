package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");
    private static final MovieService MOVIE_SERVICE = (MovieService) INJECTOR
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Taxi 25");
        movie.setDescription("Spectacular movie");
        System.out.println(MOVIE_SERVICE.add(movie));
        System.out.println(MOVIE_SERVICE.get(movie.getId()));
    }
}
