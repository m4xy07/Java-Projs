import java.util.ArrayList;

public class RecommendationBookManager {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    public static void main(String args[]) {
        ArrayList<Book> recommendations = new ArrayList<>();
        recommendations.add(new Book("Effective Java", "Joshua Bloch"));
        recommendations.add(new Book("Clean Code", "Robert C. Martin"));
        recommendations.add(new Book("Java Concurrency", "Brian Goetz"));

        //TODO 1: Add 3 new books to the recommendation list
        recommendations.add( new Book("Head First Java", "Kathy Sierra"));
        recommendations.add( new Book("Java: The Complete Reference", "Herbert Schildt"));
        recommendations.add( new Book("Thinking in Java", "Bruce Eckel"));
        for (Book book : recommendations) {
            System.out.println(book);
        }
        System.out.println("Number of recommendations: " + recommendations.size());
        System.out.println();

        /*
         * TODO 2: Update existing recommendations
         * at index 1 (2nd element)
         * at index 2 (3rd element)
         */
        recommendations.set(1, new Book("NEW EDITION Java in a Nutshell", "Ben Evans"));
        recommendations.set(2, new Book("NEW EDITION Java: A Beginner's Guide", "Herbert Schildt"));

        for (Book book : recommendations) {
            System.out.println(book);
        }
        System.out.println("Number of recommendations: " + recommendations.size());
        System.out.println();

        /*
         * TODO 3: Remove outdated recommendations
         * at index 0 (first place)
         * at index 3 (fourth place)
         */
        recommendations.remove(0);
        recommendations.remove(3);

        for (Book book : recommendations) {
            System.out.println(book);
        }
        System.out.println("Number of recommendations: " + recommendations.size());
        System.out.println();
    }
}