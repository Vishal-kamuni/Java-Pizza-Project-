import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" ............................Welcome to Pizzamania.............................");
        System.out.println(" Which pizza:(1.Veg Pizza  2.Non-Veg Pizza  3.Delux Veg Pizza  4.Delux Non-Veg Pizza ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1 :
                pizza vegPizza = new pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeaway();
                vegPizza.getBill();

            case 2 :
                pizza nonvegPizza = new pizza(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeaway();
                nonvegPizza.getBill();

            case 3 :
                DeluxPizza veg = new DeluxPizza(true);
                veg.basePizzaPrice = 550;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeaway();
                veg.getBill();
                break;


            case 4 :
                DeluxPizza nonveg = new DeluxPizza(false);
                nonveg.addExtraToppings();
                nonveg.addExtraCheese();
                nonveg.takeaway();
                nonveg.getBill();
                break;

            default :
                System.out.println("Sorry Enter Again!!!");
                return;
            }
        sc.close();
        }

    }

