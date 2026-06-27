import java.util.*;
public class inventorymachinetask2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> machine = new HashMap<>();
        machine.put("Apple", 50);
        machine.put("Banana", 30);
        machine.put("Orange", 40);
        System.out.println("Press 1:Add 2:Remove 3:Check 4:Display 5:Exit");
        int a = sc.nextInt();
        while (a != 5)
        {
            if (a == 4)
            {
                displaystock(machine);
            }
            else
            {
                sc.nextLine();
                System.out.println("ENTER PRODUCT");
                String product = sc.nextLine();
                int b = machine.get(product);
                if (a == 1)
                {
                    System.out.println("how much you want to add");
                    int d = sc.nextInt();
                    int result = addstock(b, d);
                    machine.put(product, result);
                } else if (a == 2)
                {
                    System.out.println("how much you want to remove");
                    int d = sc.nextInt();
                    int result = removestock(b, d);
                    machine.put(product, result);
                    System.out.println(product + "=" + result);

                } else if (a == 3)
                {
                    checkstock(product,machine);
                }
            }
            System.out.println("Press 1:Add 2:Remove 3:Check 4:Display 5:Exit");
            a = sc.nextInt();
        }
    }
    public static int addstock(int b, int d)
    {
        return b + d;
    }
    public static int removestock(int b, int d)
    {
        return b - d;
    }
    public static void checkstock(String product,HashMap<String, Integer> machine)
    {
        System.out.println(product + "=" + machine.get(product));
    }
    public static void displaystock(HashMap<String, Integer> machine)
    {
        System.out.println(machine);
    }
}
