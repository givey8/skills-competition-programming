/*Main Runner class*/
import java.util.Math;
public class FoodRunner {
        public static void main(String args[]){
            FoodOutline outline=new FoodOutline();
            double amount=outline.play();
            amount=outline.calculateTax(amount);
            amount=Math.round(amount*100.0)/100.0;
            System.out.println("Your total is " + amount);
            String counts=outline.getOrderCount();
            System.out.println(counts);

    }
}