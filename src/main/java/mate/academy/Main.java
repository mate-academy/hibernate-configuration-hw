package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Fast & Furious");
        movie.setDescription("Film of Action about cars");
        movieService.add(movie);
        Movie fromDB = movieService.get(movie.getId());
        System.out.println(fromDB);
    }
}
