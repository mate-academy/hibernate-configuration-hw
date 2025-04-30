package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Lord of the Rings");
        movie.setDescription("The Lord of the Rings movie description");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        //add
        movieService.add(movie);
        //get
        System.out.println(movieService.get(movie.getId()));
    }
}
