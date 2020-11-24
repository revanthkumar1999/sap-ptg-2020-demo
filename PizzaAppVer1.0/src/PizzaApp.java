import java.util.*;
public class PizzaApp {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pizza,size,crust,toppings;
		double amount=0;
		
		System.out.println("Enter the Selected PIZZA : \n1.Delux Veggle\n2.Veg Extravaganza\n3.Idli Tandoori Paneer\n4.Farmhouse\n5.Peppy Paneer\n6.Mexican Green Wave\n");
		Scanner sc= new Scanner(System.in);
				
		amount = pizzaChoice(amount, sc);
		System.out.println("\nThe total Amount : "+amount);
		
	}

	private static double pizzaChoice(double amount, Scanner sc) {
		int pizza;
		pizza = sc.nextInt();
		if(pizza == 1 || pizza == 2 || pizza == 3)
		{
			System.out.println("Select the size of Pizza : \n1.Regular\n2.Medium\n3.Large\n");
			amount = similarPizzaSize(amount, sc);
			
			System.out.println("Select the Required CRUST : \n1.New Hand Tossed\n2.Cheese Burst\n3.Fresh Pan Pizza\n4.Classic Hand Tossed\n5.Wheat Thin Crust\n");
			amount = similarCrust(amount, sc);
			
			System.out.println("Do You Require Toppings:\n1.Yes\n2.No\n");
			amount = applyToppingBasedOnChoice(amount, sc);
		}
		else if(pizza==4)
		{
			System.out.println("Select the size of Pizza : \n1.Regular\n2.Medium\n3.Large\n");
			amount = farmhousePizzaSize(amount, sc);
			System.out.println("Select the Required CRUST : \n1.New Hand Tossed\n2.Cheese Burst\n3.Fresh Pan Pizza\n4.Classic Hand Tossed\n5.Wheat Thin Crust\n");
			amount = similarCrust(amount, sc);
			
			System.out.println("Do You Require Toppings:\n1.Yes\n2.No\n");
			amount = applyToppingBasedOnChoice(amount, sc);
		}
		else if(pizza==5)
		{
			System.out.println("Select the size of Pizza : \n1.Regular\n2.Medium\n3.Large\n");
			amount = peppyPaneerPizzaSize(amount, sc);
			System.out.println("Select the Required CRUST : \n1.New Hand Tossed\n2.Cheese Burst\n3.Fresh Pan Pizza\n4.Classic Hand Tossed\n5.Wheat Thin Crust\n");
			amount = similarCrust(amount, sc);
			
			System.out.println("Do You Require Toppings:\n1.Yes\n2.No\n");
			amount = applyToppingBasedOnChoice(amount, sc);
			
		}
		else if(pizza==6)
		{
			System.out.println("Select the size of Pizza : \n1.Regular\n2.Medium\n3.Large\n");
			amount = mexicanGreenWavePizzaSize(amount, sc);
			System.out.println("Select the Required CRUST : \n1.New Hand Tossed\n2.Cheese Burst\n3.Fresh Pan Pizza\n4.Classic Hand Tossed\n5.Wheat Thin Crust\n");
			amount = similarCrust(amount, sc);
			
			System.out.println("Do You Require Toppings:\n1.Yes\n2.No\n");
			amount = applyToppingBasedOnChoice(amount, sc);
			
		}
		return amount;
	}

	private static double peppyPaneerPizzaSize(double amount, Scanner sc) {
		int size;
		size = sc.nextInt();
		
		if(size == 1)
		{
			amount=PizzaConstants.VEG_PEPPY_PANEER_REGULAR_PRICE;
		}
		return amount;
	}

	private static double mexicanGreenWavePizzaSize(double amount, Scanner sc) {
		int size;
		size = sc.nextInt();
		
		if(size == 1)
		{
			amount=PizzaConstants.VEG_MEXICAN_GREEN_WAVE_REGULAR_PRICE;
		}
		else if(size == 2)
		{
			amount=PizzaConstants.VEG_MEXICAN_GREEN_WAVE_MEDIUM_PRICE;
		}
		else if(size == 3)
		{
			amount=PizzaConstants.VEG_MEXICAN_GREEN_WAVE_LARGE_PRICE;
		}
		else
		{
			System.out.println("Invalid Input");
		}
		return amount;
	}

	private static double farmhousePizzaSize(double amount, Scanner sc) {
		int size;
		size = sc.nextInt();
		
		if(size == 1)
		{
			amount=PizzaConstants.VEG_FARMHOUSE_REGULAR_PRICE;
		}
		else if(size == 2)
		{
			amount=PizzaConstants.VEG_FARMHOUSE_MEDIUM_PRICE;
		}
		else if(size == 3)
		{
			amount=PizzaConstants.VEG_FARMHOUSE_LARGE_PRICE;
		}
		else
		{
			System.out.println("Invalid Input");
		}
		return amount;
	}

	private static double similarPizzaSize(double amount, Scanner sc) {
		int size;
		size = sc.nextInt();
		
		if(size == 1)
		{
			amount=PizzaConstants.VEG_DELUX_VEGGLE_REGULAR_PRICE;
		}
		else if(size == 2)
		{
			amount=PizzaConstants.VEG_DELUX_VEGGLE_MEDIUM_PRICE;
		}
		else if(size == 3)
		{
			amount=PizzaConstants.VEG_DELUX_VEGGLE_LARGE_PRICE;
		}
		else
		{
			System.out.println("Invalid Input");
		}
		return amount;
	}

	private static double similarCrust(double amount, Scanner sc) {
		int crust;
		crust=sc.nextInt();
		
		if(crust==1 || crust==4)
		{
			amount=amount+PizzaConstants.CRUST_NEW_HAND_TOSSED;
		}
		else if(crust==2)
		{
			amount=amount+PizzaConstants.CRUST_CHEESE_BURST;
		}
		else if(crust==3)
		{
			amount=amount+PizzaConstants.CRUST_FRESH_PAN_PIZZA;
		}
		else if(crust==5)
		{
			amount=amount+PizzaConstants.CRUST_WHEAT_THIN_CRUST;
		}
		else
		{
			System.out.println("Invalid Input");
		}
		return amount;
	}

	private static double applyToppingBasedOnChoice(double amount, Scanner sc) {
		int toppings;
		toppings=sc.nextInt();
		
		if(toppings==1)
		{
			for(int i=0;i<3;i++)
			{
				System.out.println("Select Toppings : \n1.Jalapeno\n2.Black Olive\n3.Onion\n4.RedPerika\n5.Fresh Tomato\n6.Golden corn\n7.Crish Capsicum\n8.Paneer\n9.Grilled Mashroom\n10.Paneer Tikka\n\nEnter 0 if not needed\n");
				toppings=sc.nextInt();
				
				if(toppings!=0)
				{
					amount=amount+PizzaConstants.VEG_TOPPINGS;
				}
			}
		}
		return amount;
	}

}
