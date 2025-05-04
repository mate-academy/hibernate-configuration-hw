package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.entity.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService service = (MovieService) injector.getInstance(MovieService.class);
        System.out.println(service.add(new Movie("Terminator 17", "terrific film")));

        System.out.println(service.get(1L));
    }
}
