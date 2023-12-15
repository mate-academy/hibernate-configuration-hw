package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        movie.setDescription("Description of titanic");
        movieService.add(movie);
        Movie movieFromDb = movieService.get(movie.getId());
        System.out.println(movieFromDb);
    }
}
