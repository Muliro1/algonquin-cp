import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();

      if (highwayNumber % 100 == 0) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
       
      else if ((highwayNumber < 100) && (highwayNumber % 2 == 0)){
         System.out.println("I-" + highwayNumber + " is primary, going east/west." );
      }
      else if ((highwayNumber % 2 != 0) && (highwayNumber < 100)){
         System.out.println("I-" + highwayNumber + " is primary, going north/south.");
         }
      else if (highwayNumber > 100){
          String strNumber = String.valueOf(highwayNumber);
          String subStringResult = strNumber.substring(1);
          int subIntResult;
          if (subStringResult.substring(1, 2) == "0"){
            subIntResult = Integer.parseInt(subStringResult.substring(2));
          }
          else {
            subIntResult = Integer.parseInt(subStringResult);
          }
          //System.out.println(subIntResult);
          if (subIntResult % 2 == 0){
            System.out.println("I-" + highwayNumber + " is auxiliary, serving " + "I-" + subIntResult + ", going east/west.");
          }
          else {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving " + "I-" + subIntResult + ", going north/south.");
          }
      }
      
      
      /* Type your code here. */
   }

}
