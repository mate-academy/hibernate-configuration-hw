package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector =
                Injector.getInstance("mate.academy");
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie();
        movie1.setTitle("Dune");
        movie1.setDescription("Dune: Part One");
        movieService.add(movie1);
        Movie movie2 = movieService.get(1L);
        System.out.println(movie2);
    }
}
