package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Four Rooms");
        movie.setDescription("Is directed by 4 different directors.");

        Movie savedMovie = movieService.add(movie);
        System.out.println(movie + " added");

        Movie gotMovie = movieService.get(savedMovie.getId());
        System.out.println("Got the movie: " + gotMovie);
    }
}
