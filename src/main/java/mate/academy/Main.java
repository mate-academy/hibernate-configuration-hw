package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Interstellar");
        movie.setDescription("2h 49m, 2014, 12+, Adventure:Drama:Sci-Fi");
        movieService.add(movie);
        System.out.println("Added first movie to DB: " + movie);

        movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("2h 28m, 2010, 12+, Action:Adventure:Thriller");
        movieService.add(movie);
        System.out.println("Added new movie to DB: " + movie);

        movie = movieService.get(1L);
        System.out.println("Found movie by id=1: " + movie);

        try {
            movie = movieService.get(3L);
        } catch (DataProcessingException e) {
            System.out.println("Finding movie with id=3 causes throwing an exception: "
                    + System.lineSeparator() + e.getMessage());
        }
    }
}
