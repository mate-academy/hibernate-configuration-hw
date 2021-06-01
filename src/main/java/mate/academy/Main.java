package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.exceptions.DataProcessingException;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) throws DataProcessingException {
        Movie grandBudapestHotel = new Movie();
        grandBudapestHotel.setTitle("The Grand Budapest Hotel");
        grandBudapestHotel.setDescription("Da best work by Wes Anderson");

        System.out.println(movieService.add(grandBudapestHotel));
        System.out.println(movieService.get(grandBudapestHotel.getId()));
    }
}
