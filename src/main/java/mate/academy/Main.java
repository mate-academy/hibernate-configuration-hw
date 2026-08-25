package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Shawshank Redemption");
        movie.setDescription("Two imprisoned men bond over a number of years");

        Movie savedMovie = movieService.add(movie);
        System.out.println("Saved movie id: " + savedMovie.getId());

        Movie movieFromDatabase = movieService.get(savedMovie.getId());
        System.out.println("Movie from database: " + movieFromDatabase.getTitle());
    }
}
