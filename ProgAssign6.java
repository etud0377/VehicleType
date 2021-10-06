/* Name: Etu Das
   Date: 03/26/2021

  
   Description:
   
   This program is designed to create a final report that shows the vehicle type, total commision earned, average commision
   earned, number of sales, and the total sales.A customer can enter their selling price and the type of vehicle. Then the
   program will apply its bonus comission and ask the user if they want to continue entering. 
   
   The customer is required to input all the mandatory data required to calculate 
   the vehicle type, total comission, number of sales, total sales, and the average comissions.
   
   
   After the customer input all the valid information, the program will ask the user if they want to continue. There, the customer,
   has the choice to end the program or continue inputing data. At the end of the program, it will print out a report.
   
  */
import javax.swing.JOptionPane;

public class ProgAssign6 {
   public static void main(String[] args) {
   //initializing important variables
   double totalSales = 0;
   double totalComEarned = 0;
   double bonusComm = 0;
   double avgComEarned = 0;
   String vehiType = "";
   //introducing the arrays
   int[] counterType = new int [5];
   double [] eachPrice = new double [5];
   String[] typeCar = {"Hybrid", "Coupe", "Sedan", "SUV", "Minivan"};
   String userInput = "";
  
      
   
    while (! (userInput.equalsIgnoreCase ("no"))){
         
            double sellPrice =  0;
            // here using a try-catch to catch possible errors
            do {
               try      {        
                 sellPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the sell price? "));
                 
              }
               catch (NumberFormatException e) {
                  sellPrice = 0;
              }
               if (sellPrice <= 0) {
                  JOptionPane.showMessageDialog (null, "Invalid number of sell price!Try Again: ");
               }
             }
             while (sellPrice <= 0);
             if (typeCar.equals ("")) {
               counterType [0] +=1;
               // they are all inside the while loop
               
             }
             //this is going to add the counter to the type of vehicle
             vehiType = JOptionPane.showInputDialog("Enter vehicle type: ");
             if (vehiType.equalsIgnoreCase("Hybrid")) {
               counterType [0]  += 1;
               eachPrice [0] += sellPrice;
               }else if (vehiType.equalsIgnoreCase("Coupe")){
                  counterType[1] += 1;
                  eachPrice[1] += sellPrice;
               }else if (vehiType.equalsIgnoreCase("Sedan")){
                  counterType[2] += 1;
                   eachPrice[2] += sellPrice;
               }else if (vehiType.equalsIgnoreCase("SUV")){
                  counterType[3] += 1;
                  eachPrice[3] += sellPrice;
               }else if (vehiType.equalsIgnoreCase("Minivan")){
                  counterType[4] += 1;
                  eachPrice[4] += sellPrice;
               
                  
    }
    
    
    userInput = JOptionPane.showInputDialog("Do you want to continue? ");
    //asking the user if they want to continue to input data
   
    } 
    //printing statement and introducing for loop
     String finalAmount = "Type | # of Sales | Total Sales | Total Commissions | Avg Commissions\n__________________________________________________________________";
      for (int i=0; i < counterType.length; ++i){
         if (counterType[i] != 0){
         //user switch and case to apply the bonus comissions
            switch (i){
               case 0:
                  bonusComm = .04;
                  break;
               case 1:
                  bonusComm = .015;
                  break;
               case 2:
                  bonusComm = .015;
                  break;
               case 3:
                  bonusComm = .03;
                  break;
               case 4:
                  bonusComm = .025;
                  break;
               }
               //applying the formulas to find the totalComEarned, avgComEarned, and printing the message
            totalComEarned = eachPrice[i] * bonusComm;
            avgComEarned = totalComEarned / counterType[i];
            finalAmount += "\n" + typeCar[i] + " | " + counterType[i] + " | " + String.format("$%.2f", eachPrice[i]) + " | " 
            + String.format("$%.2f", totalComEarned) + " | " + String.format("$%.2f", avgComEarned) ;
    }
    
    
    
    
}
JOptionPane.showMessageDialog(null, finalAmount);
}
}
               

   
 
   
   