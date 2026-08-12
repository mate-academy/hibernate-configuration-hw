package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie();
        movie1.setTitle("Titanic");
        movie1.setDescription("Titanic is a 1997 epic romantic disaster film directed"
                + " by James Cameron");
        movieService.add(movie1);
        Movie movie2 = new Movie();
        movie2.setTitle("Paddington");
        movie2.setDescription("The movie Paddington is a charming family film about a young bear"
                + " from Darkest Peru");
        movieService.add(movie2);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
