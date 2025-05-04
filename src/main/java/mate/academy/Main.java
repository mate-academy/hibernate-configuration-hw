package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        System.setProperty("net.bytebuddy.experimental", "true");
        Movie movie1 = new Movie();
        movie1.setTitle("Fast 5");
        movie1.setDescription("fast film");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        System.out.println(movieService.get(1L));

    }
}
