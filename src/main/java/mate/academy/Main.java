package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie avatar = new Movie();
        avatar.setTitle("Avatar");
        avatar.setDescription("Adventure");
        Movie glassOnion = new Movie();
        glassOnion.setTitle("Glass Onion");
        glassOnion.setDescription("Comedy and crime");
        Movie avatarWithId = movieService.add(avatar);
        Movie glassOnionWithId = movieService.add(glassOnion);
        System.out.println(avatarWithId);
        System.out.println(glassOnionWithId);
        Movie avatarFromDB = movieService.get(1L);
        Movie glassOnionFromDB = movieService.get(2L);
        System.out.println(avatarFromDB);
        System.out.println(glassOnionFromDB);
    }
}
