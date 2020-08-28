// created by Himanshu Bansal at 2020/08/24 10:40.
// 
// By VS-Code

package execution;

import java.util.Scanner;

import definitions.Student;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ALL_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerInput;
        Student studentInfo = new Student();
        String bookName;
        String authorName;
        do {
            System.out.print("-=-=--=-=-");
            System.out.print("Welcome To The Front Desk");
            System.out.println("-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            customerInput = scanner.nextInt();
            switch (customerInput) {
                case ISSUE_BOOK:
                    System.out.println("Enter the name of the Book you want to issue: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    authorName = scanner.nextLine();
                    studentInfo.issueBook(bookName, authorName);
                    break;
                    case RETURN_BOOK:
                    System.out.println("Enter the name of the Book you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    authorName = scanner.nextLine();
                    studentInfo.returnBook(bookName, authorName);
                    break;
                case SHOW_ALL_BOOKS:
                    System.out.println("All The Books Issued are: ");
                    scanner.nextLine();
                    break;
                default:
                    break;
            }
        } while (customerInput != EXIT);
        System.out.println("Thank You For Your Visit");
        scanner.close();
    }
}
