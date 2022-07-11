package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Hibernate");
        movie.setDescription("Hibernate is a Java framework that simplifies "
                + "the development of Java applications to interact with relational databases");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(movie.getId()));
    }
}
