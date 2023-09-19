package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie("title1","description1");
        Movie movie2 = new Movie("title2","description2");
        Movie movie3 = new Movie("title3","description3");

        System.out.println("Added movie: " + movieService.add(movie1));
        System.out.println("Added movie: " + movieService.add(movie2));
        System.out.println("Added movie: " + movieService.add(movie3));

        System.out.println("Found movie by id: " + movieService.get(2L));
        movie1.setTitle("chan");
        movie1.setDescription("changedDesc");
        System.out.println("Updated movie: " + movieService.update(movie1));
        movieService.delete(movie2);
    }
}
