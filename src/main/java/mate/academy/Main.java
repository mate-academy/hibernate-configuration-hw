package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");
    public static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);
    public static final String MOVIE_TITLE_1 = "The Wolf of Wall Street";
    public static final String MOVIE_TITLE_2 = "The Sixth Sense";
    public static final String MOVIE_DESCRIPTION_1 = "Black comedy crime film";
    public static final String MOVIE_DESCRIPTION_2 = "Psychological thriller film";

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle(MOVIE_TITLE_1);
        movie1.setDescription(MOVIE_DESCRIPTION_1);
        Movie movie2 = new Movie();
        movie2.setTitle(MOVIE_TITLE_2);
        movie2.setDescription(MOVIE_DESCRIPTION_2);
        movieService.add(movie1);
        movieService.add(movie2);
        System.out.println(movieService.get(1L));
    }
}
