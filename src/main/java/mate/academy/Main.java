package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String PACKAGE_NAME = "mate.academy";
    private static final Injector injector = Injector.getInstance(PACKAGE_NAME);

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie avengers = new Movie();
        avengers.setTitle("Avengers");
        avengers.setDescription("Marvel film about avengers");
        System.out.println(movieService.add(avengers) + "\n");

        Movie thorRagnarok = new Movie();
        thorRagnarok.setTitle("Thor Ragnarok");
        thorRagnarok.setDescription("Marvel third film about Thor");
        System.out.println(movieService.add(thorRagnarok) + "\n");

        Movie ironman = new Movie();
        ironman.setTitle("IronMan");
        ironman.setDescription("Marvel first film about Iron Man");
        System.out.println(movieService.add(ironman) + "\n");

        System.out.println(movieService.getAll() + "\n");

        Movie ironman2 = movieService.get(3L);
        ironman2.setTitle("IronMan 2 ");
        ironman2.setDescription("Marvel second film about Iron Man");
        System.out.println(movieService.update(ironman2) + "\n");

        System.out.println(movieService.getAll() + "\n");

        movieService.delete(ironman2);

        System.out.println(movieService.getAll() + "\n");
    }
}
