package mate.academy;

import mate.academy.dao.MovieService;
import mate.academy.lib.Injector;
import mate.academy.models.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService service = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Start Wars");
        movie.setDescription("Fighting in the space");

        Movie film = service.add(movie);
        System.out.println(film);

        System.out.println("----");

        Movie getFilm = service.get(film.getId());

        System.out.println(getFilm);
    }
}
