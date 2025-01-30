package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService service = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("Movie about time!");
        Movie addedMovie = service.add(movie);
        System.out.println("Added movie: " + addedMovie);
        Movie obtainedMovie = service.get(addedMovie.getId());
        System.out.println("Obtained movie with id " + addedMovie.getId()
                + ": " + obtainedMovie);
    }
}
