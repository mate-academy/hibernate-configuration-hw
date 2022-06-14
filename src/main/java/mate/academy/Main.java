package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        final Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(new Movie("Cyborgs", "Story about russian-Ukrainian war"));
        movieService.add(new Movie("Homeward", "Crimean Tatars drama film"));
        movieService.add(new Movie("My Thoughts Are Silent", "Comedy-drama film"));
        movieService.get(1L);
        movieService.get(2L);
        movieService.get(3L);
    }
}
