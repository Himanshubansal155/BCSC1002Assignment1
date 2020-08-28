// created by Himanshu Bansal at 2020/08/24 10:40.
// 
// By VS-Code

package definitions;

import java.util.Arrays;

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

    public Book[] getBooksStore() {k
        return booksStore.clone();
    }

    public void setBooksStore(Book[] booksStore) {
        this.booksStore = booksStore;
    }

    @Override
    public String toString() {
        return "Student Name: " + nameOfStudent + "University RollNumber: " + universityRollNumber
                + "No. of Books Issued: " + noOfBookIssued + "Issued Books: " + Arrays.toString(booksStore);
    }
}
