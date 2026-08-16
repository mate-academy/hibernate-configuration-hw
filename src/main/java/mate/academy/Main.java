package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setDescription("A hacker discovers the truth about reality.");

        Movie savedMovie = movieService.add(movie);
        System.out.println(savedMovie);

        Long id = savedMovie.getId();
        System.out.println("Saved movie id: " + id);

        Movie foundMovie = movieService.get(id);
        System.out.println(foundMovie);

    }
}
