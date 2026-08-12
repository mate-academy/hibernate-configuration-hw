package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("AVENGERS: END GAME");
        movie.setDescription("Endgame has a sense of "
                + "beauty behind all of the action and violence.");
        movie = new Movie();
        movie.setTitle("Doctor Strange in the Multiverse of Madness");
        movie.setDescription("To restore a world where everything is changing...");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie doctorStrange = movieService.add(movie);
        Movie avengersEndGame = movieService.add(movie);
        System.out.println(avengersEndGame);
        System.out.println(doctorStrange);
        Movie getAvengers = movieService.get(avengersEndGame.getId());
        Movie getDoctorStrange = movieService.get(doctorStrange.getId());
        System.out.println(getAvengers);
        System.out.println(getDoctorStrange);
    }
}
