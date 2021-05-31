package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie jhonWick = new Movie();
        jhonWick.setTitle("John Wick: Chapter 4");
        jhonWick.setDescription("In progress");

        Movie minions = new Movie();
        minions.setTitle("Minions:rise of Gru");
        minions.setDescription("In progress");

        movieService.add(jhonWick);
        movieService.add(minions);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
