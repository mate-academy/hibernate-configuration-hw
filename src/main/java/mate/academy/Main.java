package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Bible");
        movie.setDescription("A remarkable collection of ancient writings Christians" 
                + " believe to be God's revelation to people");
        movieService.add(movie);
        System.out.println(movie);
        movie = movieService.get(1L);
        System.out.println(movie);
    }
}
