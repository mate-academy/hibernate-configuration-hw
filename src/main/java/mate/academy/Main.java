package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        movie.setTitle("Dark Shadows");
        movie.setDescription("Awesome movie");

        System.out.println(movieService.add(movie).toString());
        System.out.println(movieService.get(movie.getId()).toString());

    }
}
