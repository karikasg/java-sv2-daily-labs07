package day02;

public class MovieMain {
    public static void main(String[] args) {
        MovieService movieService = new MovieService("src\\main\\resources\\movies.csv");
        System.out.println(movieService.getMovieList().get(1));
    }

}
