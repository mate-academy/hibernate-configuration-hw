package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static MovieService movieService;

    static {
        Injector injector = Injector.getInstance("mate.academy");
        movieService = (MovieService) injector
                .getInstance(MovieService.class);
    }

    public static void main(String[] args) {
        Movie fastAndFurious = new Movie();
        fastAndFurious.setTitle("FastAndFurious 2");
        fastAndFurious.setDescription("Speed, car and criminal");

        Movie borgVsMcEnroe = new Movie();
        borgVsMcEnroe.setTitle("Borg vs McEnroe");
        borgVsMcEnroe.setDescription("About tennis and competitions");
        System.out.println("Saving movies: ");

        movieService.add(fastAndFurious);
        movieService.add(borgVsMcEnroe);
    }
}
