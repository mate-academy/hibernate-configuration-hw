package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        //add
        Movie film1 = new Movie();
        film1.setTitle("Guardians of the Galaxy");
        film1.setDescription("a fictional superhero team");
        movieService.add(film1);
        Movie film2 = new Movie();
        film2.setTitle("Indiana Jones And The Last Crusade");
        movieService.add(film2);
        //get
        System.out.println(movieService.get(film1.getId()).getTitle());
        System.out.println(movieService.get(film2.getId()).getTitle());
    }
}
