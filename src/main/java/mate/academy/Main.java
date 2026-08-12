package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService service = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("The Game Of Thrones");
        movie.setDescription("Awesome serial");
        service.add(movie);
        System.out.println(service.get(movie.getId()));
    }
}
