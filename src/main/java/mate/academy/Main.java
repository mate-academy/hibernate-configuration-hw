package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        Movie add = movieService.add(movie);
        System.out.println("Added movie: " + add);
        Movie movie1 = movieService.get(movie.getId());
        System.out.println("Movie with id: " + movie.getId() + " : " + movie1);
    }
}
