package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator 5");
        movie.setDescription("Cool movie!");

        Movie add = movieService.add(movie);
        System.out.println("Successfully added to DB: " + add);

        Movie get = movieService.get(1L);
        System.out.println("Movie by id from DB was successfully retrieved! Movie: " + get);
    }
}
