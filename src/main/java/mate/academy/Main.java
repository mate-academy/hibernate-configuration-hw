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
        movie.setTitle("The Matrix 2");
        movie.setDescription("Reality is a bigger simulation");

        // test add()
        Movie savedMovie = movieService.add(movie);
        System.out.println("Saved movie: "
                + savedMovie.getTitle()
                + " - "
                + savedMovie.getDescription());

        // test get()
        Movie movieFromDb = movieService.get(savedMovie.getId());
        System.out.println("Movie from DB: "
                + movieFromDb.getTitle()
                + " - "
                + movieFromDb.getDescription());
    }
}
