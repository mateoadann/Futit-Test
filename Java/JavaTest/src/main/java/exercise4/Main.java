package exercise4;

import exercise4.documents.Document;
import exercise4.documents.Invoice;
import exercise4.documents.Order;
import exercise4.documents.UrgentOrder;
import exercise4.documents.humanResources.Contract;
import exercise4.documents.humanResources.Cv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a document type:");
        System.out.println("1. Invoice");
        System.out.println("2. Order");
        System.out.println("3. Urgent Order");
        System.out.println("4. Contract");
        System.out.println("5. CV");
        System.out.println("6:Exit");

        System.out.print("Your Option: ");
        int selection = scanner.nextInt();

        Document document = null;
        while (selection != 6) {
            switch (selection) {
                case 1 -> document = new Invoice();
                case 2 -> document = new Order();
                case 3 -> document = new UrgentOrder();
                case 4 -> document = new Contract();
                case 5 -> document = new Cv();
                default -> {
                    System.out.println("Invalid selection.");
                    return;
                }
            }

            System.out.println(document);

            System.out.println("\nSelect a document type:");
            System.out.println("1. Invoice");
            System.out.println("2. Order");
            System.out.println("3. Urgent Order");
            System.out.println("4. Contract");
            System.out.println("5. CV");
            System.out.println("6:Exit");
            System.out.print("Your Option: ");
            selection = scanner.nextInt();
        }

        System.out.println("Bye!");
    }
}

