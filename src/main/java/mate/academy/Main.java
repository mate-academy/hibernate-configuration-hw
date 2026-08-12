package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movieFirst = new Movie();
        movieFirst.setTitle("Fast and Furious 9");
        movieFirst.setDescription("Vin Diesel’s Dom Toretto "
                    + "is leading a quiet life off the grid with Letty and his son, little Brian, "
                    + "but they know that danger always lurks just over their peaceful horizon. "
                    + "This time, that threat will force Dom to confront the sins of his past if "
                    + "he’s going to save those he loves most. His crew joins together to stop "
                    + "a world-shattering plot led by the most skilled assassin and "
                    + "high-performance driver they’ve ever encountered: a man who also "
                    + "happens to be Dom’s forsaken brother, Jakob (John Cena, "
                    + "the upcoming The Suicide Squad).");

        System.out.println("Movie added: " + movieService.add(movieFirst));
        System.out.println("Movie get by id 1: " + movieService.get(movieFirst.getId()));
        System.out.println("Movie get by id 2: " + movieService.get(2L));

    }
}
