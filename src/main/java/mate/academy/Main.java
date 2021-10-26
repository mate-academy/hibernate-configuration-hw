package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("title1");
        movie1.setDescription("description1");
        Movie movie2 = new Movie();
        movie2.setTitle("title2");
        movie2.setDescription("description2");
        Movie movie3 = new Movie();
        movie3.setTitle("title3");
        movie3.setDescription("description3");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        Movie movie = movieService.get(movie2.getId());
        System.out.println(movie.getDescription());
    }
}
