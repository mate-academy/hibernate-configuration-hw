package mate.academy;

import java.util.Arrays;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService service =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie[] myFavoritesMovie = new Movie[] {
                new Movie("Avengers","Marvel"),
                new Movie("Avengers1","Marvel1"),
                new Movie("Avengers2","Marvel2"),
        };
        Arrays.stream(myFavoritesMovie).forEach(service::add);

    }
}
