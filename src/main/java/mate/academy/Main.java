package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie mateAdvertisement = new Movie();
        mateAdvertisement.setTitle("Mate Advertisement");
        mateAdvertisement.setDescription("Youtube advertisement");
        movieService.add(mateAdvertisement);
        Movie inDB = movieService.get(mateAdvertisement.getId());
        System.out.println(mateAdvertisement.equals(inDB));
    }
}
