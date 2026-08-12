package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.impl.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie fastAndFurious = new Movie();
        fastAndFurious.setTitle("Fast and Furious");
        fastAndFurious.setDescription("Cars, family, and action");

        movieService.add(fastAndFurious);
        System.out.println("Movie added: " + fastAndFurious);

        Movie retrievedMovie = movieService.get(fastAndFurious.getId());
        System.out.println("Movie retrieved: " + retrievedMovie);
    }
}
