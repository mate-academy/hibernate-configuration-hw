package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("One Flew Over the Cuckoo's Nest");
        movie.setDescription("It's a 1975 American psychological comedy drama film");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
