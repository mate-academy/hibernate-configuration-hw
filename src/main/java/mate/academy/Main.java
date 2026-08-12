package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Spider man");
        movie.setDescription("Movie is about a spider man");
        movieService.add(movie);
        System.out.println("Added movie with title " + movie.getTitle());

        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
