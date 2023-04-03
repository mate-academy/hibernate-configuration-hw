package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Dungeons & Dragons: Honor Among Thieves ");
        movie.setDescription("A charming thief and a band of unlikely adventurers"
                + " undertake an epic heist to retrieve a lost relic");
        movieService.add(movie);
        movie = new Movie();
        movie.setTitle("John Wick: Chapter 4");
        movie.setDescription("John Wick (Keanu Reeves) uncovers "
                + "a path to defeating The High Table");
        movieService.add(movie);
        movie = movieService.get(1L);
        System.out.println(movie);
        movie = movieService.get(2L);
        System.out.println(movie);
    }
}
