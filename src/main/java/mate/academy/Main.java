package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    public static void main(String[] args) {

        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie titanicMovie = new Movie("Titanic", "romantic, drama");
        movieService.add(titanicMovie);

        System.out.println(movieService.get(1L));
    }
}
