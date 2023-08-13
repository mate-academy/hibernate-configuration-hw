package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieServiceImpl) injector.getInstance(MovieService.class);

        Movie barbieMovie = new Movie();
        barbieMovie.setTitle("Barbie");
        barbieMovie.setDescription("I'm just Ken...");
        movieService.add(barbieMovie);

        Movie firstMovie = movieService.get(1L);
        if (firstMovie.getTitle().equals("Barbie")) {
            System.out.println("Success!");
        } else {
            System.out.println("Something went wrong...");
        }
    }
}
