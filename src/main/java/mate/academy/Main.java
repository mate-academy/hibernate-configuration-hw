package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie inception = new Movie("Inception");
        movieService.add(inception);
        System.out.println("Added: " + inception);

        Movie fetched = movieService.get(inception.getId());
        System.out.println("Fetched: " + fetched);

        mate.academy.util.HibernateUtil.shutdown();
    }
}