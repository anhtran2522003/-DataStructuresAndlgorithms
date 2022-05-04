package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * This class manages all functions relate to the product
 */
public class OperationToProduct {


    /**
     * Creating and returning a product with info input from keyboard.
     *
     * @return The product
     */
    public Product createProduct(PrintStream originalOut) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input new ID: ");
        originalOut.print("Input new ID: ");
        String iD = sc.next();
        System.out.println(iD);

        System.out.print("Input Product's Name:");
        originalOut.print("Input Product's Name:");
        String name = sc.next();
        System.out.println(name);

        System.out.print("Input Product's quantity:");
        originalOut.print("Input Product's quantity:");
        int quantity = sc.nextInt();
        System.out.println("" + quantity);

        System.out.print("Input Product's price: ");
        originalOut.print("Input Product's price: ");
        int price = sc.nextInt();
        System.out.println("" + price);


        Product newProduct = new Product(iD, name, quantity, price);
        return newProduct;
    }


    /**
     * 1. Reading all products from the file and insert them to the list at tail.
     *
     * @param fileName    The file name of the file
     * @param list        The Linked List contains all products that read from file
     * @param originalOut Set standard data output to a specified print stream
     */
    public void getAllItemsFromFile(String fileName, MyList list, PrintStream originalOut) {


        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        boolean hasData = false;

        //Load data from file
        try {
            fis = new FileInputStream(fileName);
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                Product tempProduct = new Product(line);
                Node tempNode = new Node();
                tempNode.setInfo(tempProduct);

                list.insertToTail(tempNode);
                hasData = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //Display
        if (hasData) {
//            System.out.println("ID |  Title   | Quantity | price\n" +
//                    "--------------------------------");
            displayAll(list, originalOut);
            System.out.println();
            System.out.println("Successfully!");
            originalOut.println();
            originalOut.println("Successfully!");

        } else {
            System.out.println("Không tồn tại dữ liệu trong file!");
            originalOut.println("Không tồn tại dữ liệu trong file!");
        }

    }


    /**
     * 9.Reading all products from the file and insert them to the stack.
     *
     * @param fileName    The file name of the file
     * @param stack       The Stack contains all products that read from file
     * @param originalOut Set standard data output to a specified print stream
     */
    public void getAllItemsFromFile(String fileName, MyStack stack, PrintStream originalOut) {
        // Reading  products from the file => insert them to the stack
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        //Load data from file
        try {
            fis = new FileInputStream(fileName);
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                Product tempProduct = new Product(line);
                stack.push(tempProduct);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //Display
        System.out.println("ID |  Title   | Quantity | price\n" +
                "--------------------------------");
        originalOut.println("ID |  Title   | Quantity | price\n" +
                "--------------------------------");
        Node current = stack.getHead();
        while (current != null) {
            System.out.println(current);
            originalOut.println(current);
            current = current.getNext();
        }
        System.out.println();
        originalOut.println();
        System.out.println("Successfully!");
        originalOut.println("Successfully!");


    }


    /**
     * 10. Reading all products from the file and insert them to the queue.
     *
     * @param fileName    The file name of the file
     * @param queue       The Queue contains all products that read from file
     * @param originalOut Set standard data output to a specified print stream
     */
    public void getAllItemsFromFile(String fileName, MyQueue queue, PrintStream originalOut) {

        // Reading  products from the file => insert them to the stack
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        //Load data from file
        try {
            fis = new FileInputStream(fileName);
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                Product tempProduct = new Product(line);
                queue.enqueue(tempProduct);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //Display
        System.out.println("ID |  Title   | Quantity | price\n" +
                "--------------------------------");
        originalOut.println("ID |  Title   | Quantity | price\n" +
                "--------------------------------");
        Node current = queue.getHead();
        while (current != null) {
            System.out.println(current);
            originalOut.println(current);
            current = current.getNext();
        }
        System.out.println();
        System.out.println("Successfully!");
        originalOut.println();
        originalOut.println("Successfully!");


    }

    /**
     * Adding new product to head of Linked List. The info input from keyboard.
     *
     * @param list The linked list
     */
    public void addFirst(MyList list) {

    }


    /**
     * 2. Adding a product to the list, info of the product input from keyboard.
     *
     * @param list        The Linked list
     * @param originalOut Set standard data output to a specified print stream
     */
    public void addLast(MyList list, PrintStream originalOut) {
        Node newNode = new Node(createProduct(originalOut));
        list.insertToTail(newNode);
    }

    /**
     * 3. Printing all prodcuts of the list to console screen
     *
     * @param list
     * @param originalOut Set standard data output to a specified print stream
     */
    public void displayAll(MyList list, PrintStream originalOut) {
        System.out.println("ID |  Title   | Quantity | price\n" +
                "--------------------------------");
        originalOut.println("ID |  Title   | Quantity | price\n" +
                "--------------------------------");
        Node current = new Node();
        current = list.getHead();
        while (current != null) {
            System.out.println(current);
            originalOut.println(current);
            current = current.getNext();
        }
    }


    /**
     * 4. Writing all products from the list to the file
     *
     * @param fileName    Input file name
     * @param list        Input Linked list
     * @param originalOut Set standard data output to a specified print stream
     */
    public void writeAllItemsToFile(String fileName, MyList list, PrintStream originalOut) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("DataStructureLinear/src/data.txt", false);
            Node current = new Node();
            current = list.getHead();
            while (current != null) {
                String line = current.getInfo().getFileLine() + "\n";
                byte[] b = line.getBytes("utf8");
                fos.write(b);
                current = current.getNext();
            }

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Successfully!");
        originalOut.println();
        originalOut.println("Successfully!");
    }


    /**
     * 5. Searching product by ID input from keyboard.
     *
     * @param list
     * @param originalOut Set standard data output to a specified print stream
     */
    public void searchByCode(MyList list, PrintStream originalOut) {
        System.out.print("Input the ID to search=");
        originalOut.print("Input the ID to search=");
        Scanner sc = new Scanner(System.in);
        String searchID = sc.next();
        System.out.println(searchID);
        Node current = list.getHead();
        boolean haveId = false;
        while (current != null) {
            if (current.getInfo().getBcode().equals(searchID)) {
                System.out.println("Result: " + current);
                originalOut.println("Result: " + current);

                haveId = true;
                break;
            }

            current = current.getNext();
        }
        if (!haveId) {
            System.out.println("-1");
            System.out.println("Không tồn tại sản phẩm!");
            originalOut.println("-1");
            originalOut.println("Không tồn tại sản phẩm!");
        }
    }


    /**
     * 6. Deleting first product that has the ID input from keyboard from the list.
     *
     * @param list
     * @param originalOut Set standard data output to a specified print stream
     */
    public void deleteByCode(MyList list, PrintStream originalOut) {
        System.out.print("Input the bcode to delete = ");
        originalOut.print("Input the bcode to delete = ");
        Scanner sc = new Scanner(System.in);
        String searchID = sc.next();
        System.out.println(searchID);
        Node current = list.getHead();
        boolean haveId = false;
        try {
            if (list.getHead().getInfo().getBcode().equals(searchID)) {
                list.deleteHead();
                System.out.println("Deleted!");
                originalOut.println("Deleted!");
                haveId = true;
            } else {
                while (current.getNext() != null) {
                    Node next = current.getNext();
                    if (next.getInfo().getBcode().equals(searchID)) {
                        current.setNext(next.getNext());
                        System.out.println("Deleted!");
                        originalOut.println("Deleted!");
                        haveId = true;
                        break;
                    }
                    current = current.getNext();
                }
                if (!haveId) {
                    System.out.println("Không tồn tại sản phẩm!");
                    originalOut.println("Không tồn tại sản phẩm!");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Danh sách sản phẩm rỗng!");
            originalOut.println("Danh sách sản phẩm rỗng!");
        }

    }


    /**
     * 7. Sorting products in linked list by ID
     *
     * @param list        The Linked list
     * @param originalOut Set standard data output to a specified print stream
     */
//    public void sortByCode(MyList list) {
////        Node current = list.getHead();
////        for (; current.getNext() != null; current = current.getNext()) {
////            String minCode = current.getInfo().getBcode();
////            Node nextNode = current.getNext();
////
////            Node  tempNode = null;
////            for ( ; nextNode != null; nextNode = nextNode.getNext()) {
////                if (minCode.compareTo(nextNode.getInfo().getBcode()) > 0) {
////                    tempNode = nextNode;
////                    minCode = nextNode.getInfo().getBcode();
////                }
////            }
////            if (tempNode != null) {
////                Product tempPer = new Product();
////                tempPer = tempNode.getInfo()  ;
////                tempNode.setInfo(current.getInfo()) ;
////                current.setInfo(tempPer);
////            }
////        }
////        System.out.println();
////        System.out.println("Successfully!");
////    }
    public void sortByCode(MyList list, PrintStream originalOut) {

        sort(list.getHead(), list.getTail());
        displayAll(list, originalOut);
        System.out.println();
        System.out.println("Successfully!");
        originalOut.println();
        originalOut.println("Successfully!");
    }

    void sort(Node start, Node end) {
        if (start == end)
            return;

        // split list and partition recurse
        Node pivot_prev = paritionLast(start, end);

        sort(start, pivot_prev);

        // if pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if (pivot_prev != null &&
                pivot_prev == start)
            sort(pivot_prev.getNext(), end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have pivot_prev, so we move two nodes
        else if (pivot_prev != null &&
                pivot_prev.getNext() != null)
            sort(pivot_prev.getNext().getNext(), end);
    }

    Node paritionLast(Node start, Node end) {
        if (start == end ||
                start == null || end == null)

            return start;

        Node pivot_prev = start;
        Node curr = start;
        Product pivot = end.getInfo();

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while (start != end) {
            if (start.getInfo().getBcode().compareTo(pivot.getBcode()) < 0) {
                // keep tracks of last modified item
                pivot_prev = curr;
                Product temp = curr.getInfo();
                curr.setInfo(start.getInfo());
                start.setInfo((temp));
                curr = curr.getNext();

            }

            start = start.getNext();
        }

        // swap the position of curr i.e.
        // next suitable index and pivot
        Product temp = curr.getInfo();
        curr.setInfo(pivot);
        end.setInfo(temp);

        // return one previous to current
        // because current is now pointing to pivot
//        System.out.println("privot prev: " + pivot_prev.getInfo().getBcode() + " ");
        return pivot_prev;
    }


    /**
     * 8. Convert a decimal to an array of binary. Example: input i = 18 -> Output =
     * {0, 1, 0, 0, 1}
     *
     * @param i           Input decimal number
     * @param originalOut Set standard data output to a specified print stream
     */
    public void convertToBinary(int i, PrintStream originalOut) {
//        System.out.print("Quantity=" + i + "=>(");
        System.out.print(convertBinary(i, ""));
        System.out.println(")");

        originalOut.print("Quantity=" + i + "=>(");
        originalOut.print(convertBinary(i, ""));
        originalOut.println(")");
    }

    public String convertBinary(int i, String binaryNum) {
        if (i == 0) return "";
        binaryNum = convertBinary(i / 2, binaryNum + (i % 2)) + i % 2;
        return binaryNum;
    }

    /**
     * Deleting the product at position
     *
     * @param list The Linked List
     * @param pos  The position of product to be deleted
     */
    public void deleteAtPosition(MyList list, int pos) {

    }

}
