/*Main Runner class*/
import java.lang.Math;
public class FoodRunner {
        public static void main(String args[]){
            FoodOutline outline=new FoodOutline();
            double amount=outline.play();
            amount=Math.round(amount*100)/100;
            amount=outline.calculateTax(amount);
            System.out.println("Your total is " + amount);
            String counts=outline.getOrderCount();
            System.out.println(counts);

    }
}
