package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Spider-man");
        movie.setDescription("Amazing superhero movie");
        movie = movieService.add(movie);
        Movie movieByGet = movieService.get(movie.getId());
        System.out.println(movie);
        System.out.println(movieByGet);
    }
}
