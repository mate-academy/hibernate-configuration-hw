package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie toyStory = new Movie();
        toyStory.setTitle("Toy Story 1");
        toyStory.setDescription("American computer-animated comedy film "
                + "produced by Pixar Animation Studios");
        movieService.add(toyStory);
        Movie movieFromDB = movieService.get(toyStory.getId());
        System.out.println(movieFromDB);
    }
}
