package mate.academy;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Transformer");
        movie.setDescription("the tale about a war between people and robots");
        try {
            movieService.add(movie);
        } catch (DataProcessingException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(movieService.get(1L).toString());
        } catch (DataProcessingException e) {
            e.printStackTrace();
        }
    }
}
