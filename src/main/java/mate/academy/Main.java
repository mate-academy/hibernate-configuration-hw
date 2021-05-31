package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
        private static MovieService movieService
                = (MovieService) injector.getInstance(MovieService.class);

        public static void main (String[] args){
            Movie harryPotterFirst = new Movie();
            harryPotterFirst.setTitle("Harry Potter and the philosopher's stone");
            harryPotterFirst.setDescription("Harry Potter and the Philosopher's Stone is an enthralling start " +
                    "to Harry's journey toward coming to terms with his past and facing his future");

            Movie harryPotterSecond = new Movie();
            harryPotterSecond.setTitle("Harry Potter and the chamber of secrets");
            harryPotterSecond.setDescription("The plot follows Harry's second year at Hogwarts School of Wizardry," +
                    " during which a series of messages warn that the \"Chamber of Secrets\" has been opened");

            movieService.add(harryPotterFirst);
            movieService.add(harryPotterSecond);

            System.out.println(movieService.get(harryPotterFirst.getId()));
            System.out.println(movieService.get(harryPotterSecond.getId()));
        }
}
