package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    
    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Star Wars");
        movie.setDescription("A Tale of Magicians in Space");

        Movie saveMovie = movieService.add(movie);

        Movie retrievedMovie = movieService.get(saveMovie.getId());
        System.out.println(retrievedMovie.toString());
    }
}
