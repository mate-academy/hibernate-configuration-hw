package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        String nameOfTitle1 = "Harry Potter and the Deathly Hallows: Part 1";
        String descriptionOfTitle1 = "In that part the Albus Dumbledore died!";
        Movie title1 = new Movie(nameOfTitle1, descriptionOfTitle1);
        title1 = movieService.add(title1);
        System.out.println(movieService.get(title1.getId()));

        String nameOfTitle2 = "Trolls";
        String descriptionOfTitle2 = "Fanny movie!";
        Movie title2 = new Movie(nameOfTitle2, descriptionOfTitle2);
        title2 = movieService.add(title2);
        System.out.println(movieService.get(title2.getId()));
    }
}
