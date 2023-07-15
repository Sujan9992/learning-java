package src.main;

import java.text.DecimalFormat;

public class Main {
    
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {   


    }
    public static double getSubTotal(){
        double temp = 0;
        for(int i = 0; i < prices.length; i++){
            temp += prices[i];
        }
        return temp;
    }
    public static double getTax(double subTotal){
        DecimalFormat format = new DecimalFormat("#.##");
        return Double.parseDouble(format.format(subTotal * 0.13)) ;
    }
}
 