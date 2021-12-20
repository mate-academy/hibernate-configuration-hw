package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.sirvice.movie.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService
                = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("*movie title*", "*movie description*");
        Movie addedMovie = movieService.add(movie);
        Movie movieFromDataBase = movieService.get(addedMovie.getId());
        System.out.println(addedMovie);
        System.out.println(movieFromDataBase);
    }
}
