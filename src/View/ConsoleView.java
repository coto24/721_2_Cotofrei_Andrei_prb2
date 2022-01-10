package View;

import Controller.Controller;
import Entity.Produkt;
import Repository.Repo;

import java.util.*;


public class ConsoleView {
    private Controller ctrl;

    public ConsoleView(Controller ctrl) {
        this.ctrl = ctrl;
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""

                     0. Exit Program \r
                     1. Show all Products \r
                     2. Add Produkt \r
                     3. Delete Produkt \r
                     4. Update Produkt \r
                     5. Update Inventory \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    showProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    updateInventory();
                    break;
            }

        }
    }

    private void showProducts() {
        System.out.println(ctrl.getAll());
    }


    private void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Product attributes.");
        System.out.println("Enter Product SKU:");
        try {
            int sku = scanner.nextInt();
            System.out.println("Enter Product name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter Product Preis:");
            Integer preis = scanner.nextInt();
            System.out.println("Enter Product Anzahl:");
            Integer anzahl = scanner.nextInt();

            ctrl.add(name, sku, preis, anzahl);
        } catch (Exception e) {
            throw e;
        }
    }

    private void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Produkt SKU:");
        int id = scanner.nextInt();
        ctrl.delete(id);
    }

    private void updateProduct() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You will need to write a few things that represent Product attributes.");
            System.out.println("Enter Product sku:");
            int id = scanner.nextInt();
            System.out.println("Enter Product name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter Product Preis:");
            Integer preis = scanner.nextInt();
            System.out.println("Enter Product Anzahl:");
            Integer anzahl = scanner.nextInt();

            ctrl.update(name,id,preis,anzahl);
        } catch (Exception e) {
            throw e;
        }
    }

    private void updateInventory(){
        try {
            Scanner scanner = new Scanner(System.in);
            Map<String,Integer> abc=new HashMap<>();
            System.out.println("You will need to write a few things");
            boolean ok=true;
            do {
                System.out.println("Enter Product name:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter Product Anzahl:");
                Integer anzahl = scanner.nextInt();
                abc.put(name,anzahl);

                System.out.println("Do you want to add another?[y/n]");
                String aux = scanner.nextLine();
                ok=(aux=="y");
            }while(ok);


            ctrl.update_inventory(abc);
            System.out.println(ctrl.show_updates());
        } catch (Exception e) {
            throw e;
        }
    }
}
