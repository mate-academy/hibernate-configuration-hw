package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService instance = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("SuperMan fly and Batman");
        movie.setDescription("Person which can fly");
        Movie mov = instance.get(1L);
        System.out.println(mov);
    }
}
