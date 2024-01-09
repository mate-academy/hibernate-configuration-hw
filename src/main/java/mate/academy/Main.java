package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");
    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie firstMovie = new Movie();
        Movie secondMovie = new Movie();
        firstMovie.setTitle("First film title");
        firstMovie.setDescription("First film Description");
        secondMovie.setTitle("Second film title");
        secondMovie.setDescription("Second film Description");
        movieService.add(firstMovie);
        movieService.add(secondMovie);

        System.out.println("Got movie from DB by ID " + firstMovie.getId()
                + ": " + movieService.get(firstMovie.getId()));
    }
}
