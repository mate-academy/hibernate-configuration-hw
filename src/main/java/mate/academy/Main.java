package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie fastAndFurious = new Movie();
        fastAndFurious.setTitle("Fast and Furious 9");
        fastAndFurious.setDescription("Movie about cars and racers");

        Movie hobbit = new Movie();
        hobbit.setTitle("The Hobbit: The Desolation of Smaug");
        hobbit.setDescription("Story about hobbits, gnomes and one evil dragon");

        movieService.add(fastAndFurious);
        movieService.add(hobbit);
        System.out.println(movieService.get(fastAndFurious.getId()));
        System.out.println(movieService.get(hobbit.getId()));
    }
}
