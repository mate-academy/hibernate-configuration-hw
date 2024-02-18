package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieServiceImpl movieService = (MovieServiceImpl) injector.getInstance(MovieService.class);
        Movie movieOne = new Movie();
        movieOne.setTitle("Dune. Part one");
        movieOne.setDescription("Perfect");
        System.out.println(movieService.add(movieOne));
        Movie movieTwo = new Movie();
        movieTwo.setTitle("IT");
        movieTwo.setDescription("Terribly");
        System.out.println(movieService.add(movieTwo));
        System.out.println(movieService.get(movieTwo.getId()));
    }
}
