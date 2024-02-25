package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie avatar = new Movie();
        avatar.setTitle("Foundation");
        avatar.setDescription("fantastic");
        movieService.add(avatar);
        Movie titanic = new Movie();
        titanic.setTitle("Pulp fiction");
        titanic.setDescription("comedy");
        movieService.add(titanic);
        System.out.println(movieService.get(1L));
    }
}
