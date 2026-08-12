package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Star Wars: Episode V The Empire Strikes Back");
        movie.setDescription("The film concerns the continuing struggles of the Rebel Alliance"
                + " against the Galactic Empire. During the film, Han Solo...");
        Movie movie1 = movieService.add(movie);
        System.out.println(movie1);

        Movie movie2 = movieService.get(movie1.getId());
        System.out.println(movie2);
    }
}
