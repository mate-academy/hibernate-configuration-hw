package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        System.out.println("Adding movie to the DB:");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Deadpool");
        movie.setDescription("Awesome movie!");
        Movie add = movieService.add(movie);
        System.out.println(add);
        System.out.println("Getting movie from the DB:");
        Movie movieFromDB = movieService.get(add.getId());
        System.out.println(movieFromDB);
    }
}
