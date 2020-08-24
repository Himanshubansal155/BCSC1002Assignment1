// created by Himanshu Bansal at 2020/08/24 10:40.
// 
// By VS-Code

package definitions;

public class Student {
    private String nameOfStudent;
    private long universityRollNumber;
    private int noOfBookIssued;
    private Book[] booksStore;

    public String getNameOfStudent() {
        return nameOfStudent;
    }
    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }
    public long getUniversityRollNumber() {
        return universityRollNumber;
    }
    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }
    public int getNoOfBookIssued() {
        return noOfBookIssued;
    }
    public void setNoOfBookIssued(int noOfBookIssued) {
        this.noOfBookIssued = noOfBookIssued;
    }
    public Book[] getBooksStore() {
        return booksStore;
    }
    public void setBooksStore(Book[] booksStore) {
        this.booksStore = booksStore;
    }
}
