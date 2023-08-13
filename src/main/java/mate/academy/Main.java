package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie(1L,"Harry Potter 1","Some description");
        Movie movie2 = new Movie(2L,"9 mile","Some description");
        movieService.add(movie1);
        movieService.add(movie2);
        System.out.println(movieService.get(movie1.getId()));
        System.out.println(movieService.get(movie2.getId()));
    }
}
