package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Game of Thrones");
        movie1.setDescription("Winter is coming");
        System.out.println(movieService.add(movie1));

        System.out.println(movieService.get(movie1.getId()));
    }
}
