package homework3;

public class Library {
    public static void main(String[] args) {

        //Crearea unui autor
        Author author = new Author("Cristina Hoban", "cristina.hoban@gmail.com");

        //Crearea unei carti
        Book book = new Book ("Cartea vietii", 2024, author, 49.99);

        //Afisare detalii carte
        System.out.println("Book "+book.getName() + "(" + book.getPrice() + " RON), by " + book.getAuthor().getName() + ", published in " + book.getYear() + ", feel free to submit your questions: " + author.getEmail());
    }
}