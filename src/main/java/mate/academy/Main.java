package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {

        MovieService movieService = new MovieServiceImpl();

        Movie movie = new Movie();

        movie.setTitle("Marvel");
        movie.setDescription("Marvel description");

        movie = movieService.add(movie);

        System.out.println(movie);

        System.out.println(movieService.get(movie.getId()));

    }
}
