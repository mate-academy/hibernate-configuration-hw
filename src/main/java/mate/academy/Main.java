package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static Injector injector = Injector.getInstance("mate.academy");
    public static void main(String[] args) {
            MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
            Movie movie = new Movie("50 First Dates", "Henry Roth is a man afraid of"
                + " commitment until he meets the beautiful Lucy. They hit it off and Henry think"
                + " he's finally found the girl of his dreams until discovering she has "
                + "short-term memory loss and forgets him the next day.");
            movie = movieService.add(movie);
            System.out.println(movieService.get(movie.getId()));
        }

}
