package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        Movie robocop = new Movie();
        robocop.setTitle("Robocop2");
        robocop.setDescription("Old film from USA and cool movie");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(robocop);
        System.out.println(movieService.get(1L));
    }
}



