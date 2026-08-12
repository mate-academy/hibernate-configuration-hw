package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public Main() {
    }

    public static void main(String[] args) {
        MovieService movieService = (MovieService)injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Avatar");
        movie.setDescription("A paraplegic Marine dispatched to the moon Pandora on a "
                + "unique mission becomes torn between following his orders and protecting "
                + "the world he feels is his home.");
        Movie addToDb = movieService.add(movie);
        System.out.println(addToDb);
        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
