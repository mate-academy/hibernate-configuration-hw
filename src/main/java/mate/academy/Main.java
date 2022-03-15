package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        addNewMovie(movieService);
        printMovie(movieService);
    }

    private static void addNewMovie(MovieService movieService) {
        Movie movie = new Movie();
        movie.setTitle("Wild Max, chapter 3");
        movie.setDescription("apocalyptic movie");
        Movie addedMovie = movieService.add(movie);
        System.out.println(addedMovie);
    }

    private static void printMovie(MovieService movieService) {
        System.out.println(movieService.get(1L));
    }
}
