package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        for (int i = 1; i <= 3; i++) {
            movie.setTitle("Lord of the Rings " + i);
            movie.setDescription("This is film number " + i
                    + " of the three greatest fictional adaptations!");
            movieService.add(movie);
            System.out.println("Info about the movie: " + movieService.get((long) i));
        }
    }
}
