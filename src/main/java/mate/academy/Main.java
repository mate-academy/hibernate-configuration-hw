package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Great Gatsby");
        movie.setDescription("Only one man was exempt from my disgust..");

        //Create operation
        System.out.println(movieService.add(movie));

        //Read operation
        System.out.println(movieService.get(1L));
    }
}
