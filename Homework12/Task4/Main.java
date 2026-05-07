package homework_12.task_4;

public class Main {
    static void main(String[] args) {
        MovieService movieService = new MovieService();

        Movie movie = new Movie("Interstellar", "Drama", 2010);
        Movie movie2 = new Movie("Matrix", "Action", 2000);
        Movie movie3 = new Movie("Titanic", "Drama", 1999);

        movieService.addRating(movie, new Rating<>(8));
        movieService.addRating(movie, new Rating<>(7.5));
        movieService.addRating(movie, new Rating<>(6));

        movieService.addRating(movie2, new Rating<>(5));
        movieService.addRating(movie2, new Rating<>(6.6));
        movieService.addRating(movie2, new Rating<>(5));

        movieService.addRating(movie3, new Rating<>(9));
        movieService.addRating(movie3, new Rating<>(8));
        movieService.addRating(movie3, new Rating<>(8.8));

        System.out.println("Средняя оценка фильмов:"
                + movie + ", rating = " + movieService.getAverageRating(movie)
                + movie2 + ", rating = " + movieService.getAverageRating(movie2)
                + movie3 + ", rating = " + movieService.getAverageRating(movie3));

        System.out.println("\nСписок фильмов по популярности:");

        System.out.println(movieService.getSortedMoviesByAverage());
    }
}
