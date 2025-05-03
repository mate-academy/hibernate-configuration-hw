package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setDescription("The Godfather");

        Movie movie2 = new Movie();
        movie2.setDescription("black man");
        movie2.setTitle("Super Man");

        Movie movie3 = new Movie();
        movie3.setTitle("Spider");
        movie3.setDescription("red man");

        MovieService movieService = new MovieServiceImpl();
        movieService.add(movie);
        movieService.add(movie2);
        movieService.add(movie3);

        System.out.println(movieService.get(2L));

    }
}
