package mate.academy;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) throws DataProcessingException {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movieComedy = new Movie();
        movieComedy.setTitle("The Big Bang Theory");
        movieComedy.setDescription("Comedy serial");
        movieService.add(movieComedy);
        Movie movieThriller = new Movie();
        movieThriller.setTitle("Jason Bourne");
        movieThriller.setDescription("Thriller movie");
        movieService.add(movieThriller);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
