package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Iron man 2");
        movie.setDescription("a movie about super hero from Marvel");

        Movie addedMovie = movieService.add(movie);
        System.out.println("Added movie: " + addedMovie);

        Movie retrievedMovie = movieService.get(addedMovie.getId());
        System.out.println("Retrieved movie: " + retrievedMovie);
    }
}
