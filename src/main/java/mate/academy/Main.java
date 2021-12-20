package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Terminator 5");
        movie.setDescription("Awesome movie");
        System.out.println("add to DB movie " + movieService.add(movie).getTitle());
        System.out.println("result " + movieService.get(movie.getId()));
    }
}
