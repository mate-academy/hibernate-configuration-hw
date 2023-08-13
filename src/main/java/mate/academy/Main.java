package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        // Create movie
        Movie movie = new Movie();
        movie.setTitle("The Lord of the Rings");
        movie.setDescription(" Set in Middle-earth, the three films follow the young "
                + "Hobbit Frodo Baggins as he and a Fellowship embark on a quest to "
                + "destroy the One Ring, and with it, "
                + "ensure the destruction of the Dark Lord Sauron.");

        // Save movie to DB
        Movie movieFromDb = movieService.add(movie);
        System.out.println(movieFromDb);

        // Get movie by id from DB
        Movie movieFromDbById = movieService.get(movie.getId());
        System.out.println(movieFromDbById);
    }
}
