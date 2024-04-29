package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector INJECTOR = Injector.getInstance("mate.academy.service");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(3);
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Fantastic movie");

        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        System.out.println(movieService.get(movie.getId()));
    }
}
