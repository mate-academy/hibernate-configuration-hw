package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();

        Movie movie = new Movie("Interstellar", "Space travel");
        movieService.add(movie);

        movieService.getAll().forEach(m ->
                System.out.println(m.getId() + " " + m.getTitle())
        );
    }
}
