package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    static final Injector injector = Injector.getInstance("mate.academy");
    static final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminatorMovie = new Movie();
        terminatorMovie.setTitle("Terminator");
        terminatorMovie.setDescription("Cool movie");
        Movie sixtyShadesMovie = new Movie();
        sixtyShadesMovie.setTitle("Sixty Shades Of Grey");
        sixtyShadesMovie.setDescription("Not so cool movie");
        movieService.add(terminatorMovie);
        movieService.add(sixtyShadesMovie);
        System.out.println(movieService.get(terminatorMovie.getId()));
        System.out.println(movieService.get(sixtyShadesMovie.getId()));
    }
}
