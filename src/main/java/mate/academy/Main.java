package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");
    public static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie akira = new Movie();
        akira.setTitle("Akira");
        akira.setDescription("1988 Japanese animated cyberpunk action film");
        movieService.add(akira);
        System.out.println(movieService.get(akira.getId()));
    }
}
