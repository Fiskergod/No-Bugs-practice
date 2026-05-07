package homework_12.task_4;

import java.util.Objects;

public class Movie {
    private String title;
    private String genre;
    private int year;

    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.year = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(genre, movie.genre) && year == movie.year;
    }

    @Override
    public String toString() {
        return "\nMovie title = " + title + ", genre = " + genre + ", releaseYear = " + year;
    }
}
