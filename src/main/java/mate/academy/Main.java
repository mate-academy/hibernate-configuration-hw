package mate.academy;

import mate.academy.entity.Movie;
import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    @Inject
    public static void main(String[] args) {
        Movie first = new Movie();
        first.setTitle("First Movie");
        first.setDescription("Movie with id 1");
        Movie second = new Movie();
        second.setTitle("Second Movie");
        second.setDescription("Movie with id 2");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        System.out.println(movieService.add(first));
        System.out.println(movieService.add(second));
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
