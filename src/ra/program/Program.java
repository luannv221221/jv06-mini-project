package ra.program;

import ra.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> list = new ArrayList<>();

        do {
            System.out.println("==========MENU==========");
            System.out.println("1. Nhập vào sách ");
            System.out.println("2. In ra danh sách ");
            System.out.println("Chọn menu ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    do {
                        Book book =new Book();
                        book.inputData();
                        list.add(book);
                        System.out.println("Muốn nhập nữa không (1. có) Or (0. Ko)");
                        int check = Integer.parseInt(sc.nextLine());
                        if(check == 0)
                            break;
                    } while (true);
                    break;
                case 2:
                    break;
            }
        } while (true);
    }
}
