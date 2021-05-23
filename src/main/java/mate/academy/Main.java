package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;


public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie sherlockHolmes = new Movie("Sherlock Holmes", "The valley of fear");
        Movie fastAndFurious = new Movie("Fast and furious 9", "New fast and furious film");

        System.out.println(movieService.add(sherlockHolmes));
        System.out.println(movieService.add(fastAndFurious));

        System.out.println(movieService.get(sherlockHolmes.getId()));
        System.out.println(movieService.get(fastAndFurious.getId()));
    }
}
