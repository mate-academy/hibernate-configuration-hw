package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie gameOfThrones = new Movie("Game Of Thrones", "Awesome fantasy movie");
        Movie harryPotterAndTheCursedChild =
                new Movie("Harry Potter and the Cursed Child", "New film about Harry Potter");

        System.out.println("----Movies before saving----");
        System.out.println(gameOfThrones);
        System.out.println(harryPotterAndTheCursedChild);

        movieService.add(gameOfThrones);
        movieService.add(harryPotterAndTheCursedChild);

        System.out.println("-----Movies after saving----");
        System.out.println(gameOfThrones);
        System.out.println(harryPotterAndTheCursedChild);

        System.out.println("----Testing get method-----");
        System.out.println(movieService.get(gameOfThrones.getId()));
        System.out.println(movieService.get(harryPotterAndTheCursedChild.getId()));
    }
}
