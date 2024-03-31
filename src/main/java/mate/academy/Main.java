package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie dune = new Movie();
        dune.setTitle("Dune");
        dune.setDescription("Cool epic film");

        Movie theGentlemen = new Movie();
        theGentlemen.setTitle("The Gentlemen");
        theGentlemen.setDescription("Cool criminal film");

        Movie godFather = new Movie();
        godFather.setTitle("The Godfather");
        godFather.setDescription("Fine gangster film");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println(movieService.add(dune));
        System.out.println(movieService.add(theGentlemen));
        System.out.println(movieService.add(godFather));

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
