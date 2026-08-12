package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Kill Bill");
        movie.setDescription("The third film by Quentin Tarantino...");
        Movie killBill = movieService.add(movie);
        System.out.println(movieService.get(killBill.getId()));
    }
}
