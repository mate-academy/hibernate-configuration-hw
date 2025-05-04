package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService service = (MovieService) injector.getInstance(MovieService.class);
        Movie dune = new Movie();
        dune.setTitle("Dune");
        dune.setDescription("Some description");
        service.add(dune);

        Movie tor = new Movie();
        tor.setTitle("Tor");
        tor.setDescription("Tarzan movie description");
        service.add(tor);

        System.out.println(service.get(2L));
    }
}
