package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminatorOne = new Movie();
        terminatorOne.setTitle("Terminator");
        terminatorOne.setDescription("The Terminator is a fictional cyborg assassin, "
                + "featured in the popular movie franchise created by James Cameron. "
                + "The character is portrayed as a nearly indestructible machine, "
                + "designed to look like a human being, with a mission to eliminate "
                + "specific targets.");
        movieService.add(terminatorOne);
        System.out.println(terminatorOne);
        System.out.println(movieService.get(terminatorOne.getId()));

        Movie terminatorTwo = new Movie();
        terminatorTwo.setTitle("Terminator 2");
        terminatorTwo.setDescription("\"Terminator 2: Judgment Day\" "
                + "is a 1991 science fiction action film directed by James Cameron "
                + "and starring Arnold Schwarzenegger, Linda Hamilton, and Edward Furlong.");
        movieService.add(terminatorTwo);
        System.out.println(terminatorTwo);
        System.out.println(movieService.get(terminatorTwo.getId()));
    }
}
