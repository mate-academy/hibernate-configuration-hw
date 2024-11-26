package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println("\n *** CREATE AND READ FUNCTIONS TEST *** \n");
        Movie movie1 = new Movie();
        movie1.setTitle("Gladiator");
        movie1.setDescription("Gladiator");
        movieService.add(movie1);

        Movie movie2 = new Movie();
        movie2.setTitle("Gladiator");
        movie2.setDescription("Gladiator");
        movieService.add(movie2);

        Movie movie3 = new Movie();
        movie3.setTitle("Gladiator");
        movie3.setDescription("Gladiator");
        movieService.add(movie3);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));

        System.out.println("\n *** UPDATE AND READ FUNCTIONS TEST *** \n");
        movie1.setTitle("Gladiator");
        movie1.setDescription("Amazing");
        movieService.update(movie1);

        movie2.setTitle("Pulp Fiction");
        movie2.setDescription("The movie!");
        movieService.update(movie2);

        movie3.setTitle("Avatar");
        movie3.setDescription("Nice");
        movieService.update(movie3);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));

        System.out.println("\n *** DELETE AND READ FUNCTIONS TEST *** \n");
        System.out.println(movieService.delete(3L));

    }
}
