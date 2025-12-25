package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector
            = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService service = (MovieService)
                injector.getInstance(MovieService.class);
        Movie movie1 = new Movie();
        movie1.setTitle("The Godfather");
        movie1.setDescription("Cool movie");
        service.add(movie1);
        Movie movie2 = new Movie();
        movie2.setTitle("Pirates of the Caribbean");
        movie2.setDescription("Exciting movie");
        service.add(movie2);
        System.out.println(service.get(1L));
    }
}
