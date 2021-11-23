package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    private List<Movie> movieList = new ArrayList<>();

    public MovieService(String file) {
        List<String> rows = null;

        try {
            rows = Files.readAllLines(Paths.get(file));
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (String row : rows) {
            Scanner scanner = new Scanner(row);
            scanner.useDelimiter(";");
            String title = scanner.next();
            int year = Integer.parseInt(scanner.next());
            String director = scanner.next();

            movieList.add(new Movie(title, year, director));
        }
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
