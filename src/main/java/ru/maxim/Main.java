package ru.maxim;
import ru.maxim.test.models.MenuItem;
import ru.maxim.test.models.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            MenuItem salat = new MenuItem("Salad", "Food", 500, 100, true, 100);

            salat.displayInfo();
            salat.isExpensive();

            int[] numbers = {1, 2, 3, 6};
            Array ar1 = new Array(numbers);
            ar1.Print();
            ar1.Print("Hello");

            var ar2 = new Array(new int[]{10, 15, 20,25});
            ar2.Print();

        }
    }
