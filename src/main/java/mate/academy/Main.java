package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie movie = new Movie("Drive", "Drive is a 2011 American action drama film " 
                + "directed by Nicolas Winding Refn. The screenplay, written by Hossein Amini, " 
                + "is based on James Sallis's 2005 novel of the same name.");
        Movie added = movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }

}
