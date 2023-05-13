package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie fastAndFurious = new Movie("Fast and Furious", "Awesome film");
        movieService.add(fastAndFurious);
        Movie movieFromDB = movieService.get(fastAndFurious.getId());
        System.out.println(movieFromDB);
    }
}
