package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService service = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie("Avatar", "American epic science fiction film");
        Movie movie2 = new Movie("Lord of The Rings", "Epic fantasy adventure film");
        service.add(movie1);
        service.add(movie2);
        Movie result = service.get(movie1.getId());
        System.out.println(result);
    }
}
