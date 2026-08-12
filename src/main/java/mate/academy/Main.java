package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService service = (MovieService) injector.getInstance(MovieService.class);
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        terminator.setDescription("The best movie ever");

        Movie cinderella = new Movie();
        cinderella.setTitle("Cinderella");
        cinderella.setDescription("Kids cartoon");

        service.add(terminator);
        service.add(cinderella);

        Movie movie = service.get(5L);
        System.out.println(movie);
    }
}
