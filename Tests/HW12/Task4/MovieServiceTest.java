package homework_12.task_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    /**
     * TEST CASES:

     * happy path:
     - addPositiveRating
     - getAverageRating
     - getSortedMoviesByAverageTest

     * negative path:
     - getAverageByRating_movieNotFound

     * edge path:
     - validateGrade
     */
    MovieService movieService;
    Movie movie;
    Rating<Integer> rating;

    @BeforeEach
    public void setUp() {
        movieService = new MovieService();
        movie = new Movie("Vikings", "Action", 2010);
        rating = new Rating<>(5);
        movieService.addRating(movie, rating);
        movieService.addRating(movie, rating);
    }

    @Test
    @DisplayName("Добавление положительной оценки.")
    void addPositiveRatingTest() {
        assertEquals(2, movieService.getMovieRatingMap().get(movie).size());
    }

    @Test
    @DisplayName("Расчет средней оценки.")
    void getAverageRatingTest() {
        movieService.addRating(movie, rating);
        OptionalDouble avg = movieService.getAverageRating(movie);

        assertTrue(avg.isPresent());
        assertEquals(5.0, avg.getAsDouble(), 0.001);
    }

    @Test
    @DisplayName("Сортировка фильмов по популярности.")
    void getSortedMoviesByAverageTest() {
        Movie movie2 = new Movie("Titanic", "Drama", 2010);
        movieService.addRating(movie2, new Rating<>(10));
        movieService.addRating(movie2, rating);
        List<Movie> sortedMovies = movieService.getSortedMoviesByAverage();

        assertEquals(movie2, sortedMovies.getFirst(), "Первый - лучший фильм");
        assertEquals(movie, sortedMovies.getLast(), "Последний - худший фильм");
    }

    @Test
    @DisplayName("Расчет средней оценки у несуществующего объекта.")
    void getAverageByRating_movieNotFoundTest() {
        movieService.getMovieRatingMap().clear();

        assertThrows(IllegalArgumentException.class,
                () -> movieService.getAverageRating(null));
    }

    @Test
    @DisplayName("Проверка валидации оценок.")
    void validateGradeTest() {
        assertThrows(IllegalArgumentException.class,
                () -> movieService.addRating(movie, new Rating<>(-4)));
    }
}
