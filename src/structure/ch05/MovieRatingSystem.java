package structure.ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MovieRatingSystem {

	public static void main(String[] args) {
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("범죄도시4", 5));
		movies.add(new Movie("기생충", 4));
		movies.add(new Movie("올드보이", 5));
		movies.add(new Movie("인생은 아름다워", 3));
		
		System.out.println(movies);
		
		for(Movie movie : movies){
			System.out.println(movie.getTitle());
		}
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i));
		}
		System.out.println("------------------------");
		Collections.sort(movies, new Comparator<Movie>() {

			@Override
			public int compare(Movie m1, Movie m2) {
				// TODO Auto-generated method stub
				return Integer.compare(m2.getRating(), m1.getRating());
			}
			
		});
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
	
}

class Movie{
	private String title;
	private int rating;
	
	public Movie(String title, int rating) {
		this.title = title;
		this.rating = rating;
		
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + "]";
	}

	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}
	
	
}
