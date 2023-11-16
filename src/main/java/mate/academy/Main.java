package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Long ID_FOR_MOVIE_1 = 1L;
    private static final Long ID_FOR_MOVIE_2 = 2L;
    private static final Long ID_FOR_MOVIE_3 = 3L;
    private static final String FIRST_TITLE = "First title";
    private static final String SECOND_TITLE = "Second title";
    private static final String THIRD_TITLE = "Third title";
    private static final String FIRST_DESCRIPTION = "First description";
    private static final String SECOND_DESCRIPTION = "Second description";
    private static final String THIRD_DESCRIPTION = "Third description";
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);

        Movie movie1 = new Movie();
        movie1.setTitle(FIRST_TITLE);
        movie1.setDescription(FIRST_DESCRIPTION);
        Movie movie2 = new Movie();
        movie2.setTitle(SECOND_TITLE);
        movie2.setDescription(SECOND_DESCRIPTION);
        Movie movie3 = new Movie();
        movie3.setTitle(THIRD_TITLE);
        movie3.setDescription(THIRD_DESCRIPTION);
        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        Movie movieById1 = movieService.get(ID_FOR_MOVIE_1);
        System.out.println(movieById1);
        Movie movieById2 = movieService.get(ID_FOR_MOVIE_2);
        System.out.println(movieById2);
        Movie movieById3 = movieService.get(ID_FOR_MOVIE_3);
        System.out.println(movieById3);
    }
}
