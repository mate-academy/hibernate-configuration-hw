package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Sherlock Holmes");
        movie.setDescription("A very interesting series, you can watch it forever. "
                + "This is a timeless classic))");
        Movie movieAddedToDB = movieService.add(movie);
        System.out.println(movieAddedToDB);
        Movie movieFromDB = movieService.get(movieAddedToDB.getId());
        System.out.println(movieFromDB);
    }
}
