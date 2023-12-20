package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy")
                .getInstance(MovieService.class);

        Movie theLastOfUs = new Movie();
        theLastOfUs.setTitle("The Last Of Us");
        theLastOfUs.setDescription("Movie about zombies");
        movieService.add(theLastOfUs);

        Movie movie = movieService.get(theLastOfUs.getId());
        System.out.println(movie);
    }
}
