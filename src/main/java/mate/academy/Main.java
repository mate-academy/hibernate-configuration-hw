package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie1 = new Movie();
        movie1.setTitle("One piece");
        movie1.setDescription("Kaizoku oni orewa naru!");
        System.out.println(movieService.add(movie1));
        System.out.println(movieService.get(1L));
    }
}
