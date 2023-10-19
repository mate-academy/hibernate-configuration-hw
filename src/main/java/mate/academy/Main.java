package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie();
        //        movie1.setDescription("Nice movie!");
        //        movie1.setTitle("Spiderman");
        //        movieService.add(movie1);

        Movie movie = movieService.get(null);
        System.out.println(movie);
    }
}
