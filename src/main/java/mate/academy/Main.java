package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        //creating a new movie for adding to the DB
        Movie movie = new Movie("Naruto", "This is an anime.");
        //adding the created movie to the DB
        Movie addedMovie = movieService.add(movie);
        //getting a movie from the DB by id
        Movie movieFromDbById = movieService.get(addedMovie.getId());

        System.out.println("The created movie: " + movie);
        System.out.println("The added movie: " + addedMovie);
        System.out.println("The movie which we got by id: " + movie);

    }
}
