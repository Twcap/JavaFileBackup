import java.util.ArrayList;

class CalculateTotal {

  public static void main(String[] args) {
    // arraylist create to
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);

    double total = 0;

    // Iterate over expenses
    for(int i= 0; i < expenses.size(); i++){
        // addes each ideration to total
       total +=  expenses.get(i);
      }
    // prints total
    System.out.println(total);

  }

}
