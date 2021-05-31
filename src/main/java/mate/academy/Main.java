package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");
    public static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDescription("Have you ever had a dream that you were so sure was real?");

        Movie inception = new Movie();
        inception.setTitle("Inception");
        inception.setDescription("A thief who steals corporate secrets "
                + "through the use of dream-sharing technology "
                + "is given the inverse task of planting an idea into the mind of a C.E.O.");

        movieService.add(matrix);
        movieService.add(inception);
        System.out.println(matrix);
        System.out.println(inception);

        System.out.println(movieService.get(matrix.getId()));
        System.out.println(movieService.get(inception.getId()));
    }
}
