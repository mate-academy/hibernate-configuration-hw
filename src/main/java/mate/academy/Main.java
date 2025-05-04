package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("A mind-bending thriller by Christopher Nolan.");

        MovieService movieService = new MovieServiceImpl();
        movieService.add(movie);

        System.out.println(movieService.get(2L));

    }
}
