package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setDescription("Movie about robot");
        MovieService movieService = (MovieService) injector
                .getInstance(MovieService.class);
        System.out.println("Createt object - " + movie);
        System.out.println("Added to DB - " + movieService.add(movie));
        System.out.println("Get from DB - " + movieService.get(movie.getId()));
    }
}
