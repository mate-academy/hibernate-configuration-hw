package mate.academy;

import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final long FINDING_BY_ID = 5L;
    private static final List<Movie> listOfMovies = List.of(
            new Movie("Alice in wonderland",
                    """
                            Nineteen-year-old Alice returns to the magical world
                            from her childhood adventure, where she reunites with
                            her old friends and learns of her true destiny: to end
                            the Red Queen's reign of terror."""),
            new Movie("Chinatown",
                    """
                            A private detective hired to expose an adulterer
                            in 1930s Los Angeles finds himself caught up in
                            a web of deceit, corruption, and murder."""),
            new Movie("Titanic",
                    """
                            A seventeen-year-old aristocrat falls in love with
                            a kind but poor artist aboard the luxurious,
                            ill-fated R.M.S. Titanic."""),
            new Movie("Gladiator",
                    """
                            A former Roman General sets out to exact vengeance
                            against the corrupt emperor who murdered his family
                            and sent him into slavery."""),
            new Movie("Miss Peregrine's Home for Peculiar Children",
                    """
                            When Jacob discovers clues to a mystery that stretches
                            across time, he finds Miss Peregrine's Home for
                            Peculiar Children. But the danger deepens after
                            he gets to know the residents and learns about
                            their special powers.""")
    );

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        for (Movie movie : listOfMovies) {
            movieService.add(movie);
        }

        Movie foundedMovieById = movieService.get(FINDING_BY_ID);
        System.out.println(foundedMovieById);
    }
}
