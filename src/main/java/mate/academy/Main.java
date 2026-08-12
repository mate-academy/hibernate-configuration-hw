package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie homeAlone = new Movie();
        homeAlone.setTitle("Home Alone 1");
        homeAlone.setDescription("A story "
                + "about a boy who was left alone at home for Christmas");

        Movie titanic = new Movie();
        titanic.setTitle("Titanic");
        titanic.setDescription("A romantic with a tragic ending");

        Movie addedHomeAlone = movieService.add(homeAlone);
        Movie addedTitanic = movieService.add(titanic);

        Movie homeAloneFromDB = movieService.get(addedHomeAlone.getId());
        Movie titanicFromDB = movieService.get(addedTitanic.getId());

        System.out.println(homeAloneFromDB);
        System.out.println(titanicFromDB);
    }
}

