package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean choseFunc = true;
        OperationToProduct product = new OperationToProduct();
        MyList list = new MyList();
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        try {
            PrintStream fileOut = new PrintStream("DataStructureLinear/src/console_output.txt");
            PrintStream fileErr = new PrintStream("DataStructureLinear/src/err.txt");
            System.setOut(fileOut);
            System.setErr(fileErr);

            while (choseFunc) {
//            menu
                int numFunc = menu(originalOut);
                switch (numFunc) {
                    //1. Load data from file and display
                    case 1:
                        product.getAllItemsFromFile("DataStructureLinear/src/data.txt", list, originalOut);
                        break;
                    case 2:
                        product.addLast(list, originalOut);
                        break;
                    case 3:
                        product.displayAll(list, originalOut);
                        break;
                    case 4:
                        product.writeAllItemsToFile("DataStructureLinear/src/data.txt", list, originalOut);
                        break;
                    case 5:
                        product.searchByCode(list, originalOut);
                        break;
                    case 6:
                        product.deleteByCode(list, originalOut);
                        break;
                    case 7:
                        product.sortByCode(list, originalOut);
                        break;
                    case 8:
                        product.convertToBinary(list.getHead().getInfo().getQuantity(), originalOut);
                        break;
                    case 9:
                        product.getAllItemsFromFile("DataStructureLinear/src/data.txt", stack, originalOut);
                        break;
                    case 10:
                        product.getAllItemsFromFile("DataStructureLinear/src/data.txt", queue, originalOut);
                        break;
                    case 0:
                        choseFunc = false;
                        break;
                }
//                System.setOut(originalOut);
//                System.setErr(originalErr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static int menu(PrintStream originalOut) {
        int numFunc;
        Scanner sc = new Scanner(System.in);
        int choiceNum;
        boolean choseFunc = true;
        do {
            System.out.println();
            originalOut.println();
            String textMenu = "Product list:\n" +
                    "1. Load data from file and display\n" +
                    "2. Input & add to the end.\n" +
                    "3.Display data\n" +
                    "4.Save product list to file.\n" +
                    "5. Search by ID\n" +
                    "6.Delete by ID\n" +
                    "7.Sort by ID.\n" +
                    "8. Convert to Binary \n" +
                    "9. Load to stack and display\n" +
                    "10. Load to queue and display.\n" +
                    "Exit:\n" +
                    "0. Exit\n" +
                    "\n" +
                    "Choice: ";
            System.out.print(textMenu);
            originalOut.print(textMenu);
            choiceNum = sc.nextInt();
            System.out.println("" + choiceNum);

            if (choiceNum > 10) {
                System.out.println("Chọn chức năng từ 0-10. Hãy chọn lại!");
                originalOut.println("Chọn chức năng từ 0-10. Hãy chọn lại!");

                System.out.println();
            } else {
                choseFunc = false;
            }
        } while (choseFunc);
        return choiceNum;
    }
}
