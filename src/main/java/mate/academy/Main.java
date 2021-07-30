package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie2 = new Movie();
        movie2.setTitle("terminator");
        movie2.setDescription("hasta la vista");
        movieService.add(movie2);
        System.out.println(movieService.get(1L));
    }
}
