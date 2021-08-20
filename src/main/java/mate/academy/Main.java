package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie forRooms = new Movie();
        forRooms.setTitle("4 rooms");
        forRooms.setDescription("Four Rooms is a 1995 American anthology black comedy film "
                + "co-written and co-directed by Robert Rodriguez, Quentin Tarantino etc.");

        movieService.add(forRooms);

        Movie movieWithId1 = movieService.get(1L);
        System.out.println("The movie with id = 1 is: " + movieWithId1);
    }
}
