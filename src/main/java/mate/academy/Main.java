package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieOne = new Movie();
        movieOne.setTitle("The Departed");
        movieOne.setDescription("In this crime-action tour de force, the South Boston state "
                + "police force is waging war on Irish-American organized crime");

        Movie movieTwo = new Movie();
        movieTwo.setTitle("Big Lebowski");
        movieTwo.setDescription("Jeff \"The Dude\" Lebowski, mistaken for a millionaire of the "
                + "same name, seeks restitution for his ruined rug and enlists his bowling buddies "
                + "to help get it.");

        movieService.add(movieOne);
        movieService.add(movieTwo);
        System.out.println(movieOne.getId());
        System.out.println(movieService.get(movieOne.getId()));
        System.out.println(movieTwo.getId());
        System.out.println(movieService.get(movieTwo.getId()));
    }
}
