package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService instance = (MovieService) injector.getInstance(MovieService.class);
        instance.add(new Movie("Holms","+ Vatson"));
        instance.add(new Movie("Kolombo","Best Film"));
        System.out.println(instance.get(1L));
    }
}
