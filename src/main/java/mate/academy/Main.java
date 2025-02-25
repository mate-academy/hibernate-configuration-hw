package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setDescription("A story about a New York mafia family. "
                + "Aging Don Corleone wants to pass power to his son");
        //add
        movieService.add(movie);
        //get
        System.out.println(movieService.get(movie.getId()));
    }
}
