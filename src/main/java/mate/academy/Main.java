package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setDescription("Science fiction");

        movieService.add(movie);

        Movie movieFromDb = movieService.get(movie.getId());

        System.out.println("Movie id: " + movieFromDb.getId());
        System.out.println("Title: " + movieFromDb.getTitle());
        System.out.println("Description: " + movieFromDb.getDescription());
    }
}
