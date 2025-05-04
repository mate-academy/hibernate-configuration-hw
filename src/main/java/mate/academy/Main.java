package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious");
        movie.setDescription("2001, Producer: Vin Diesel");
        Movie movie1 = new Movie();
        movie1.setTitle("Fast and Furious 2");
        movie1.setDescription("2003, Producer: John Singleton");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);
        movieService.add(movie1);
        Movie movieById1 = movieService.get(movie.getId());
        Movie movieById2 = movieService.get(movie1.getId());
        System.out.println(movieById1);
        System.out.println(movieById2);
    }
}
