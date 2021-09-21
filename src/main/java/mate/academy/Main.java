package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movieDune = new Movie();
        movieDune.setTitle("Dune");
        movieDune.setDescription("Sci-Fi movie with IMDb rating: 8.5");
        Movie movieMatrix = new Movie();
        movieMatrix.setTitle("The Matrix Resurrections");
        movieMatrix.setDescription("Realise 22.12.2021");
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        movieService.add(movieDune);
        movieService.add(movieMatrix);
        Movie movieId1 = movieService.get(1L);
        Movie movieId2 = movieService.get(2L);
        System.out.println(movieId1);
        System.out.println(movieId2);
    }
}
