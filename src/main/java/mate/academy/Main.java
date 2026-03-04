package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie newMovie = new Movie();
        newMovie.setTitle("Inception");
        newMovie.setDescription("Description");
        Movie savedMovie = movieService.add(newMovie);
        System.out.println("Movie added: " + savedMovie.getId() + " - " + savedMovie.getTitle());

        Movie retrievedMovie = movieService.get(savedMovie.getId());
        System.out.println("Movie retrieved: " + retrievedMovie.getId()
                + " - " + retrievedMovie.getTitle());

    }
}
