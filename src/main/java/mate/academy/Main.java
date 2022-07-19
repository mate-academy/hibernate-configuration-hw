package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie();
        movie1.setTitle("Avatar");
        movie1.setDescription("fantasy");
        System.out.println(movieService.add(movie1));

        Movie movie2 = new Movie();
        movie2.setTitle("Titanic");
        movie2.setDescription("drama, historical");
        System.out.println(movieService.add(movie2));
        System.out.println(System.lineSeparator());

        System.out.println(movieService.get(movie1.getId()));
        System.out.println(System.lineSeparator());
        System.out.println(movieService.get(movie2.getId()));
    }
}
