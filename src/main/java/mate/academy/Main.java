package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie greatGatsby = new Movie("Great Gatsby", "Ambitious and idealistic");
        movieService.add(greatGatsby);
        Movie fromDB = movieService.get(greatGatsby.getId());
        System.out.println(greatGatsby.equals(fromDB));
    }
}
