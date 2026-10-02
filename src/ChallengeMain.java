public class ChallengeMain {
    public static void main(String[] args) {
        Author author = new Author("Gabriel Garcia Marquez");

        Book book1 = new Book("Cien anos de soledad", author, 120.0);
        author.addBook(book1);
        author.addBook("El amor en los tiempos del colera", 95.0);

        System.out.println("Author: " + author.getName());
        System.out.println("Books:");

        for (Book book : author.getBooks()) {
            book.getInfo();
        }
    }
}
