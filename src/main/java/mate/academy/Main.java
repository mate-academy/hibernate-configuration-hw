package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService  movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie inceptionMovie = new Movie();
        inceptionMovie.setDescription("A thief who steals corporate secrets through the use " +
                "of dream-sharing technology is given the inverse task of planting an idea into" +
                " the mind of a C.E.O., but his tragic past may doom the project and his team " +
                "to disaster.");
        inceptionMovie.setTitle("Inception");
        movieService.add(inceptionMovie);
        System.out.println(movieService.get(inceptionMovie.getId()));
    }
}
