package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie toyStoryMovie = new Movie("Toy Story 10");
        Movie ironManMovie = new Movie("Iron Man 4");
        ironManMovie.setDescription("Not as good as Iron Man 3");
        movieService.add(toyStoryMovie);
        movieService.add(ironManMovie);
        System.out.println(movieService.get(toyStoryMovie.getId()).getTitle());
        System.out.println(movieService.get(ironManMovie.getId()).getDescription());
    }
}
