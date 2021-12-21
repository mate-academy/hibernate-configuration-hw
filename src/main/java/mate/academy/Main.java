package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie titanic = new Movie();
        titanic.setTitle("Titanic");
        titanic.setDescription("A movie about a certain ship");
        movieService.add(titanic);
        Movie getTitanic = movieService.get(titanic.getId());
        System.out.println(titanic.equals(getTitanic));
    }
}
