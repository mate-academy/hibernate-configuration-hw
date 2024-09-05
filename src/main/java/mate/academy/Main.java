package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    @Inject
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setDescription("description 1");
        movie1.setTitle("title1");
        Movie movie2 = new Movie();
        movie2.setDescription("description 2");
        movie2.setTitle("title 2");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        System.out.println(movieService.add(movie1));
        System.out.println(movieService.add(movie2));
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
