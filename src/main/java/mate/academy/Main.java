package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) INJECTOR.getInstance(MovieService.class);
    private static final Movie TITATNIC_MOVIE = new Movie("Titanic",
            "The Titanic was a British passenger liner that sank on its "
                    + "maiden voyage in April 1912 after hitting an iceberg in the "
                    + "North Atlantic.");
    private static final Movie AVATAR_MOVIE = new Movie("Avatar",
            "Avatar is a 2009 sci-fi film directed by James Cameron, "
                    + "known for its groundbreaking 3D technology. It's set on the moon "
                    + "Pandora and follows a human interacting with the Na'vi people.");

    public static void main(String[] args) {
        movieService.add(TITATNIC_MOVIE);
        movieService.add(AVATAR_MOVIE);

        Movie firstMovieFromDb = movieService.get(1L);
        Movie secondMovieFromDb = movieService.get(2L);

        System.out.println(firstMovieFromDb);
        System.out.println(secondMovieFromDb);
    }
}
