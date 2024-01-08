package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieServiceImpl) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Knockin' On Heaven's Door");
        movie.setDescription("\"Knockin' on Heaven's Door\" is a comedy and drama two in one.");

        Movie savedMovie = movieService.add(movie);
        System.out.println("Saved movie: " + savedMovie);

        Movie movieFromDb = movieService.get(savedMovie.getId());
        System.out.println("Movie from DB: " + movieFromDb);
    }
}
