package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie newMovie = new Movie();
        newMovie.setTitle("Green book");
        newMovie.setDescription("Based on real story");
        movieService.add(newMovie);
        System.out.println(newMovie);

        Movie searchResult = movieService.get(newMovie.getId());
        System.out.println(searchResult);
    }
}
