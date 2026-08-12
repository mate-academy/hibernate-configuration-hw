package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService service = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie();
        movie1.setTitle("American Psycho");
        System.out.println(service.add(movie1));
        System.out.println(service.get(1L));
    }
}
