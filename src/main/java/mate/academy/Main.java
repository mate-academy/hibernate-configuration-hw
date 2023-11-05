package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Awesome movie");
        movieService.add(movie);

        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
