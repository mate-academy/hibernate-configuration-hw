package mate.academy;

import java.util.List;
import mate.academy.entity.Movie;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Shawshank Redemption");
        movie.setDescription("Best movie ever");

        Movie movie1 = new Movie();
        movie1.setTitle("Inception");
        movie1.setDescription("Mind-bending movie");

        Movie movie2 = new Movie();
        movie2.setTitle("The Dark Knight");
        movie2.setDescription("Superhero movie");

        Movie movie3 = new Movie();
        movie3.setTitle("Interstellar");
        movie3.setDescription("Space exploration movie");

        List<Movie> movies = List.of(movie, movie1, movie2, movie3);

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movies.forEach(movieService::add);

        System.out.println(movieService.get(1L));
    }
}
