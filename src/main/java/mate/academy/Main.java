package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("THE MATRIX RESURRECTIONS");
        movie.setDescription("Plagued by strange memories, Neo's life takes an unexpected "
                + "turn when he finds himself back inside the Matrix.");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
