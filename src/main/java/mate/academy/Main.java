package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie raiders = new Movie();
        raiders.setTitle("Raiders of the lost Ark");
        raiders.setDescription("Adventure movie");
        movieService.add(raiders);
        System.out.println(raiders);
        Movie seven = new Movie();
        seven.setTitle("Seven");
        seven.setDescription("Thriller");
        movieService.add(seven);
        System.out.println(seven);
        System.out.println(movieService.get(raiders.getId()));
        System.out.println(movieService.get(seven.getId()));
    }
}
