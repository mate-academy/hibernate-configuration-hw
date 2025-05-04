package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie passengers = new Movie();
        passengers.setTitle("Passengers");
        passengers.setDescription("Jennifer Lawrence and Chris Pratt are two passengers "
                + "onboard a spaceship transporting them to a new life on another planet.");

        Movie murderMystery = new Movie();
        murderMystery.setTitle("Murder Mystery 2");
        murderMystery.setDescription("Four years after solving their first murder mystery, Nick "
                + "and Audrey Spitz are now full-time detectives struggling to get their private "
                + "eye agency off the ground");

        Movie kandahar = new Movie();
        kandahar.setTitle("Kandahar");
        kandahar.setDescription("CIA operative Tom Harris failed his mission and his identity"
                + " was exposed. Now the agent has to escape from Afghanistan.");

        movieService.add(passengers);
        movieService.add(murderMystery);
        movieService.add(kandahar);

        Movie movieOne = movieService.get(passengers.getId());
        Movie movieTwo = movieService.get(murderMystery.getId());
        Movie movieThree = movieService.get(kandahar.getId());

        System.out.println(movieOne);
        System.out.println(movieTwo);
        System.out.println(movieThree);
    }
}
