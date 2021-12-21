package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.setTitle("Some film title");
        movieOne.setDescription("Description for some film title");
        movieService.add(movieOne);

        Movie movieTwo = new Movie();
        movieTwo.setTitle("Some new film title");
        movieTwo.setDescription("Description for some new film title");
        movieService.add(movieTwo);

        Movie movieFromDb = movieService.get(2L);
        System.out.println(movieFromDb);
        Movie movieFromDbBadId = movieService.get(-1L);
    }
}
