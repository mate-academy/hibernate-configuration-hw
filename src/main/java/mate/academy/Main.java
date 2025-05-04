package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String TITLE_1 = "Fast and furious";
    private static final String DESCRIPTION_1 = "Speed is everything, team is everything";
    private static final String TITLE_2 = "Saw X";
    private static final String DESCRIPTION_2 = "Witness the return of Jigsaw";
    private static final String TITLE_3 = "Spider-Man";
    private static final String DESCRIPTION_3 = "Turn your world upside down";

    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle(TITLE_1);
        movie1.setDescription(DESCRIPTION_1);

        Movie movie2 = new Movie();
        movie2.setTitle(TITLE_2);
        movie2.setDescription(DESCRIPTION_2);

        Movie movie3 = new Movie();
        movie3.setTitle(TITLE_3);
        movie3.setDescription(DESCRIPTION_3);

        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);

        System.out.println(movieService.get(3L));
    }
}
