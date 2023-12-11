package ra.model;

import java.util.Scanner;

public class Book implements IBook{
    private String bookId;
    private String bookName;
    private double price;
    private String author;

    public Book() {
    }

    public Book(String bookId, String bookName, double price, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sách ");
        do {
            bookId = scanner.nextLine();
            if(bookId.startsWith("B")){
                if(bookId.length() == 4){
                    break;
                } else {
                    System.out.println("Mã sách phải 4 ký tự");
                }
            } else {
                System.err.println("Mã phải bắt đầu Bằng B");
            }

        } while (true);
        // nhập tiếp nhé và validate dữ liệu theo yêu cầu
    }

    @Override
    public void displayData() {

    }
}
