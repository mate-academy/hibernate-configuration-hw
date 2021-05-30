package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    
    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDescription(
                "After years of searching, Morpheus and Trinity finally find information about a "
                        + "man that could possibly be The One they have been searching for who is"
                        + " capable of manipulating the Matrix universe.");
        
        movieService.add(matrix);
        System.out.println(movieService.get(matrix.getId()));
    }
}
