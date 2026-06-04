package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("A mind-bending thriller");
        movie = movieService.add(movie);
        System.out.println("Added movie: " + movie.getId() + " - " + movie.getTitle());

        Movie foundMovie = movieService.get(movie.getId());
        System.out.println("Found movie: " + foundMovie.getId() + " - " + foundMovie.getTitle());
    }
}

