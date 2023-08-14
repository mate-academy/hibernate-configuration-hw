package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector
                .getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setDescription("SomeDescription");
        movie.setTitle("SomeTitle");
        Movie savedMovie = movieService.add(movie);
        System.out.println(savedMovie);
        Movie getMovie = movieService.get(savedMovie.getId());
        System.out.println(getMovie);
        System.out.println("compleate");
    }
}
