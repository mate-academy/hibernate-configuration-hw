package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Kroli");
        movie.setDescription("Toni-Hroni");
        MovieService services = (MovieService) injector.getInstance(MovieService.class);
        services.add(movie);
        System.out.println(services.get(1L));
    }
}
