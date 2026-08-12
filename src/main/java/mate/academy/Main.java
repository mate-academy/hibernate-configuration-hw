package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Interstellar");
        movie1.setDescription("epic science fiction drama film");
        Movie movie2 = new Movie();
        movie2.setTitle("Schindler's List");
        movie2.setDescription("epic historical drama film");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movie1 = movieService.add(movie1);
        movie2 = movieService.add(movie2);
        System.out.println(movieService.get(movie1.getId()));
        System.out.println(movieService.get(movie2.getId()));
    }
}
