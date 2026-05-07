package homework_12.task_4;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MovieService {
    private final Map<Movie, List<Rating<? extends Number>>> movieRatingMap = new ConcurrentHashMap<>();

    public Map<Movie, List<Rating<? extends Number>>> getMovieRatingMap() {
        return Collections.unmodifiableMap(movieRatingMap);
    }

    public void addRating(Movie movie, Rating<? extends Number> rating) {
        if (movie == null || rating == null) {
            throw new IllegalArgumentException("Фильм или оценка не должны быть null!");
        }

        movieRatingMap.computeIfAbsent(movie, f -> new CopyOnWriteArrayList<>())
                .add(rating);
    }

    public OptionalDouble getAverageRating(Movie movie) {
        if (movie == null) {
            throw new IllegalArgumentException("Фильм не должен быть null!");
        }
        List<Rating<? extends Number>> ratings = movieRatingMap.get(movie);

        if (ratings == null || ratings.isEmpty()) {
            return OptionalDouble.empty();
        }

        return ratings.stream()
                .mapToDouble(el -> el.getGrade().doubleValue())
                .average();
    }

    public List<Movie> getSortedMoviesByAverage() {
        return movieRatingMap.keySet().stream()
                .filter(movie -> !movieRatingMap.get(movie).isEmpty())
                .sorted((m1, m2) -> {
                    double avg = getAverageRating(m1).orElse(0.0);
                    double avg2 = getAverageRating(m2).orElse(0.0);
                    return Double.compare(avg2, avg);
                })
                .collect(Collectors.toList());
    }
}
