// created by Himanshu Bansal at 2020/08/24 10:40.
// 
// By VS-Code

package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksAvailable;

    public Library() {
        this.booksAvailable = new Book[10];
        for (int i = 0; i < booksAvailable.length; i++) {
            booksAvailable[i] = new Book();
        }
    }

    public Library(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    public Book[] getBooksAvailable() {
        return booksAvailable;
    }

    public void setBooksAvailable(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    @Override
    public String toString() {
        return Arrays.toString(booksAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Library library = new Library();
        return Arrays.equals(getBooksAvailable(), library.getBooksAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksAvailable());
    }

}
