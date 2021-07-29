package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie sherlock = new Movie();
        sherlock.setTitle("Sherlock");
        sherlock.setDescription("Sherlock Holmes, an analytical deduction fanatic,"
                + " is helping the police out"
                + " with their enquiries for fun, when he runs into potential flatmate "
                + "Dr John Watson, fresh from serving in the war in Afghanistan.");
        movieService.add(sherlock);
        System.out.println(movieService.get(sherlock.getId()));

        Movie fifthElement = new Movie();
        fifthElement.setTitle("Fifth Element");
        fifthElement.setDescription("The only hope for mankind is the Fifth Element, who comes to"
                + " Earth to protect the humans with four stones of the four elements:"
                + " fire, water, Earth and air.");
        movieService.add(fifthElement);
        System.out.println(movieService.get(fifthElement.getId()));
    }
}
