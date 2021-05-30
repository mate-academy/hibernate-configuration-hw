package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");
    public static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie solaris = new Movie();
        solaris.setTitle("Solaris");
        solaris.setDescription("Science-documental");

        Movie saw = new Movie();
        saw.setTitle("Saw");
        saw.setDescription("Scary");

        Movie mirrors = new Movie();
        mirrors.setTitle("Mirrors");
        mirrors.setDescription("Scary");

        movieService.add(solaris);
        movieService.add(saw);
        movieService.add(mirrors);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
