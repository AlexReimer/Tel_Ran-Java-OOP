public class Test {
    public static void main(String[] args) {

        Movie movie1 = new Movie(
                "Titanic",
                8.5,
                "Cemeron",
                "good",
                "Drama",
                200,
                2_000_000
        );

        System.out.println(movie1.toDisplay());

        Movie movie2 = new Movie(
                "Gary Poter",
                9.8,
                "Peter Gary",
                "good good",
                "Child",
                300,
                200_000
        );

        Movie[]netflix = new Movie[] {movie1, movie2};
        Movie.movieArrayGenreToDislay(netflix, "Child");


    }
}
