package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Titanic");
        movie1.setDescription("1997, Producer: James Cameron");
        Movie movie2 = new Movie();
        movie2.setTitle("Terminator 2: Judgment Day");
        movie2.setDescription("1991, Producer: James Cameron");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        movieService.add(movie2);

        Movie movieById1 = movieService.get(movie1.getId());
        System.out.println(movieById1);
        Movie movieById2 = movieService.get(movie2.getId());
        System.out.println(movieById2);
    }
}
