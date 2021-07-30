package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie homeAlone1 = new Movie();
        homeAlone1.setTitle("Home Alone 1");
        homeAlone1.setDescription("An eight-year-old troublemaker must protect his house from a pair of burglars when "
                + "he is accidentally left home alone by his family during Christmas vacation.");
        movieService.add(homeAlone1);
        System.out.println(homeAlone1);
        Movie homeAlone2 = new Movie();
        homeAlone2.setTitle("Home Alone 2: Lost in New York");
        homeAlone2.setDescription("One year after Kevin McCallister was left home alone and had to defeat a pair of "
                + "bumbling burglars, he accidentally finds himself stranded in New York City - and the same criminals "
                + "are not far behind.");
        movieService.add(homeAlone2);
        System.out.println(homeAlone2);

        System.out.println(movieService.get(homeAlone1.getId()));
        System.out.println(movieService.get(homeAlone2.getId()));
    }
}
