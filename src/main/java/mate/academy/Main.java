package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate");
    private static MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminator = new Movie();
        Movie avatar = new Movie();
        terminator.setTitle("Terminator 5");
        terminator.setDescription("Awesome movie");
        avatar.setTitle("Avatar");
        avatar.setDescription("Sci-fi movie");
        movieService.add(terminator);
        movieService.add(avatar);
        movieService.get(terminator.getId());
        movieService.get(avatar.getId());
    }
}
