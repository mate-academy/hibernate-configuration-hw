package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService)injector.getInstance(MovieService.class);
        Movie scaryMovie = new Movie();
        scaryMovie.setTitle("Scary movie");
        scaryMovie.setDescription("comedy");
        movieService.add(scaryMovie);
        Movie movieId3FromDB = movieService.get(3L);
        System.out.println(movieId3FromDB);
    }
}
