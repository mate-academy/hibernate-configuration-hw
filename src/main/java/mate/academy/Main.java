package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDescription("Thomas Anderson, a computer programmer, is led "
                + "to fight an underground war against powerful computers who have constructed "
                + "his entire reality with a system called the Matrix.");
        movieService.add(matrix);
        System.out.println(movieService.get(matrix.getId()));

        Movie interstellar = new Movie();
        interstellar.setTitle("Interstellar");
        interstellar.setDescription("When Earth becomes uninhabitable in the future, a farmer "
                + "and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, "
                + "along with a team of researchers, to find a new planet for humans.");
        movieService.add(interstellar);
        System.out.println(movieService.get(interstellar.getId()));
    }
}
