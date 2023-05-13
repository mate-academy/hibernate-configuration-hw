package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final Long FIRST_MOVIE_ID = 1L;
    private static final Long SECOND_MOVIE_ID = 2L;
    private static final Long THIRD_MOVIE_ID = 3L;

    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setTitle("2022. American comedy horror film.");
        firstMovie.setDescription("");

        Movie secondMovie = new Movie();
        secondMovie.setTitle("2015. Spy film.");
        secondMovie.setDescription("");

        Movie thirdMovie = new Movie();
        thirdMovie.setTitle("X-Men: First Class");
        thirdMovie.setDescription("2011. Superhero film.");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(firstMovie);
        movieService.add(secondMovie);
        movieService.add(thirdMovie);

        Movie firstMovieFromDb = movieService.get(FIRST_MOVIE_ID);
        Movie secondMovieFromDb = movieService.get(SECOND_MOVIE_ID);
        Movie thirdMovieFromDb = movieService.get(THIRD_MOVIE_ID);

        System.out.println("First movie is added and got from DB: "
                + firstMovie.equals(firstMovieFromDb));
        System.out.println("Second movie is added and got from DB: "
                + secondMovie.equals(secondMovieFromDb));
        System.out.println("Third movie is added and got from DB: "
                + thirdMovie.equals(thirdMovieFromDb));
    }
}
