package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Lord of the rings");
        movie.setDescription("Fantasy film about ...");
        Movie lordOfTheRings = movieService.add(movie);
        Long id = lordOfTheRings.getId();
        System.out.println(id);
        Movie lotrFromDb = movieService.get(id);
        System.out.println(lotrFromDb);
    }
}
