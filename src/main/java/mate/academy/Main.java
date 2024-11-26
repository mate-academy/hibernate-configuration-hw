package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println("\n *** CREATE AND READ FUNCTIONS TEST - add() and get() *** \n");
        // CREATE
        Movie movie1 = new Movie();
        movie1.setTitle("Gladiator");
        movie1.setDescription("the movie!");

        Movie movie2 = new Movie();
        movie2.setTitle("Gladiator");
        movie2.setDescription("the movie!");

        Movie movie3 = new Movie();
        movie3.setTitle("Gladiator");
        movie3.setDescription("the movie!");

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);

        // READ
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));

        System.out.println("\n *** UPDATE AND READ FUNCTIONS TEST - add() and findAll *** \n");

        // UPDATE
        movie1 = movieService.get(1L);
        movie2 = movieService.get(2L);
        movie3 = movieService.get(3L);

        movie1.setDescription("nice");

        movie2.setTitle("Avatar");
        movie2.setDescription("amazing");

        movie3.setTitle("Up");
        movie3.setDescription("touching");

        movieService.update(movie1);
        movieService.update(movie2);
        movieService.update(movie3);

        // READ
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));

        // DELETE
        System.out.println("\n *** DELETE AND READ FUNCTIONS TEST - delete and findAll *** \n");
        movieService.delete(3L);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));

        System.out.println("\n *** DELETE FUNCTIONS TEST ON NOT EXISTING ID - delete *** \n");
        System.out.println(movieService.delete(4L));
    }
}
