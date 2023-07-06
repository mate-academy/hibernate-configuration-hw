package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.setName("Avatar");
        movie1.setDescription("Fantastic");

        Movie movie2 = new Movie();
        movie2.setName("Avatar2");
        movie2.setDescription("Fantastic2");

        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        movieService.add(movie2);

        Movie movieFromDb = movieService.get(2L);
        System.out.println(movieFromDb);
    }
}
