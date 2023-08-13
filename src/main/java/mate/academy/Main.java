package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie oppenheimer = new Movie("Oppenheimer", "epic biographical thriller film");
        movieService.add(oppenheimer);
        Movie movieFromDB = movieService.get(oppenheimer.getId());
        System.out.println(oppenheimer.equals(movieFromDB));
    }
}
