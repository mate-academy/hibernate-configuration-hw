package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie avatar = new Movie();
        avatar.setTitle("Avatar");
        avatar.setDescription("fiction");
        movieService.add(avatar);
        Movie titanic = new Movie();
        titanic.setTitle("Titanic");
        titanic.setDescription("romance");
        movieService.add(titanic);
        System.out.println(movieService.get(2L));
    }
}
