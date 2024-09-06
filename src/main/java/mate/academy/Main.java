package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie firstMovie = new Movie("Modern Java", "Best practises of coding");
        Movie secondMovie = new Movie("Harry Potter and the Philosopher's Stone",
                "It follows Harry Potter, a young wizard who discovers his magical heritage "
                        + "on his eleventh birthday when he receives a letter of acceptance to "
                        + "Hogwarts School of Witchcraft and Wizardry.");
        Movie thirdMovie = new Movie("The Little Prince",
                "The story follows a young prince who visits various planets, "
                        + "including Earth, and addresses themes of loneliness, friendship, love, "
                        + "and loss.");
        movieService.add(firstMovie);
        movieService.add(secondMovie);
        movieService.add(thirdMovie);
        movieService.get(2L);
    }
}
