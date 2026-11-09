package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Interstellar");
        movie.setDescription("A science fiction film");

        movieService.add(movie);

        System.out.println("Created movie ID: " + movie.getId());

        Movie retrievedMovie = movieService.get(movie.getId());

        System.out.println("Movie title: " + retrievedMovie.getTitle());
        System.out.println("Movie description: " + retrievedMovie.getDescription());

        try {
            movieService.get(999L);
        } catch (DataProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}
