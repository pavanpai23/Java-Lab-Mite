package ASSINGMNET;

class Book {
    String title;

    void showTitle(String t) {
        title = t;
        System.out.println("Book Title: " + title);
    }
}

class Author extends Book {
    String authorName;

    void showAuthor(String t, String a) {
        showTitle(t);   // calling parent class method
        authorName = a;
        System.out.println("Author Name: " + authorName);
    }
}

public class first{
    public static void main(String[] args) {

        Author A = new Author();

        A.showAuthor("Java Programming", "James Gosling");
    }
}