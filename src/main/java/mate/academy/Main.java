package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static Injector injector = Injector.getInstance("mate.academy");
    public static void main(String[] args) {
       MovieService  movieService = (MovieService) injector.getInstance(MovieService.class);
       Movie movie = new Movie("The Godfather", "The aging patriarch of an organized crime dynasty " +
               "in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.");
       movie = movieService.add(movie);
       System.out.println(movieService.get(movie.getId()));
    }
}
