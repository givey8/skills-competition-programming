/*Main Runner class*/
public class FoodRunner {
        public static void main(String args[]){
            FoodOutline outline=new FoodOutline();
            double amount=outline.play();
            amount=outline.calculateTax(amount);
            System.out.println("Your total is " + amount);
            String counts=outline.getOrderCount();
            System.out.println(counts);

    }
}