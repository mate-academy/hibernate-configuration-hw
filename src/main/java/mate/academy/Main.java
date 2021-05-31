package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);
    
    public static void main(String[] args) {
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDescription(
                "After years of searching, Morpheus and Trinity finally find information about a "
                        + "man that could possibly be The One they have been searching for who is"
                        + " capable of manipulating the Matrix universe.");
        
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        terminator.setDescription("No fate");
        movieService.add(matrix);
        movieService.add(terminator);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
