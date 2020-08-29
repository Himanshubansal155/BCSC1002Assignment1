// created by Himanshu Bansal at 2020/08/24 10:40.
// 
// By VS-Code

package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book() {
        this.bookName = "Object oriented Programming";
        this.authorName = "Cay S. Horstmann";
        this.ISBNNumber = "1234567890123";
    }

    public Book(String bookName, String authorName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String iSBNNumber) {
        ISBNNumber = iSBNNumber;
    }

    @Override
    public String toString() {
        return "Book Name: " + getBookName() + ", " + "Author Name: " + getAuthorName() + ", " + "ISBN Number: "
                + getISBNNumber() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return getAuthorName() == book.getAuthorName() && getISBNNumber() == book.getISBNNumber()
                && Objects.equals(getBookName(), book.getBookName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getISBNNumber());
    }

}
