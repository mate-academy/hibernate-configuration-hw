package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie("Birdman");
        movie1.setDescription("Oscar 2015 - Best Picture");
        movieService.add(movie1);

        Movie movie2 = new Movie("Three Billboards Outside Ebbing, Missouri");
        movie2.setDescription("Oscar 2018 - Best Actress in a Leading Role");
        movieService.add(movie2);

        System.out.println(movieService.get(movie2.getId()));
    }
}
