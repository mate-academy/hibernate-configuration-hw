package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.servise.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Harry Potter and Prisoner of Azkaban");
        movie.setDescription("fantasy");

        System.out.println("Movie was added to DB: " + movieService.add(movie));
        System.out.println("Movie by id 1 from DB: " + movieService.get(1L));
    }
}
