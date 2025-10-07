package mate.academy;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.movieservice.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        MovieService movieServiceInstance =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("The Shawshank Redemption");
        movie.setDescription("Description of The Shawshank Redemption");
        movieServiceInstance.add(movie);

    }
}
