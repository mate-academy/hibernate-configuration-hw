package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector INJECTOR = Injector.getInstance("mate.academy.service");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Fantastic movie");

        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie newMovie = movieService.add(movie);
        System.out.println(movieService.get(newMovie.getId()));
    }
}
