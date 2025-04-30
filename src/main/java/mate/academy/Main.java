package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.setTitle("Iron Man");
        movieOne.setDescription("2008, USA");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println("Movie one successfully added: " + movieService.add(movieOne));
        System.out.println("Successfully found movie with 1L ID: " + movieService.get(1L));
    }
}
