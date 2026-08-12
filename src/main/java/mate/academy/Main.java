package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie dracula = new Movie();
        dracula.setTitle("Dracula");
        dracula.setDescription("Chrrrrrr");

        Movie avatar = new Movie();
        avatar.setTitle("Avatar");
        avatar.setDescription("I'm blue");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(dracula);
        movieService.add(avatar);
        System.out.println(movieService.get(2L));

    }
}
