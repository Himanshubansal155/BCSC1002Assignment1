// created by Himanshu Bansal at 2020/08/24 10:40.
// 
// By VS-Code

package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book(){
        this.bookName = "oops";
        this.authorName = "hb";
        this.ISBNNumber = "1234567890123";
    }
    public Book(String bookName){
        this.bookName = bookName;
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

}
