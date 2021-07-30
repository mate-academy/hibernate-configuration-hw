package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
        private static final Injector injector = Injector.getInstance("mate.academy");
        private static final MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
//        Movie FAF = new Movie();
//        FAF.setTitle("Fast and furious");
//        FAF.setDescription("racing film");
//        movieService.add(FAF);

        Movie next = new Movie();
       next.setTitle("Глубокая глотка");
       next.setDescription("family film");
        movieService.add(next);
    }
}
