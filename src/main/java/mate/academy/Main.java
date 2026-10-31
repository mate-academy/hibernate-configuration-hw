package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Terminator 5");
        movie.setDescription("Awesome movie");
        Movie savedMovie = movieService.add(movie);
        System.out.println("Movie added with id: " + savedMovie.getId());
        Movie getMovie = movieService.get(savedMovie.getId());
        System.out.println("Movie title: " + getMovie.getTitle());
        System.out.println("Movie description: " + getMovie.getDescription());
    }
}
