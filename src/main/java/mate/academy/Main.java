package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie("Kingsman", "greatest film ever");
        Movie movie2 = new Movie("King Artur", "Good film!");
        Movie movie3 = new Movie("The Gentlemen", "second best film ever");

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);

        System.out.println(movieService.get(movie3.getId()));
    }
}
