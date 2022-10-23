import java.util.Scanner;
import java.util.Arrays;
//======================================================================================================================
public class StreetMaintenance {
//======================================================================================================================
private static Scanner keyboard = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------------
    public static void main(String [] args) {

        int[] houseNumbers;
        int numHouses;
        int index;
        int row, column;
        int numPeople;

//----Input data

        //----number of houses array
        System.out.print("How many houses in the street? : ");
        numHouses = keyboard.nextInt();
        houseNumbers = new int[numHouses];
        System.out.println("");

        int[][] houseAges = new int[numHouses][];

        for (index = 0; index < houseNumbers.length; index++) {
            System.out.print("What is the next house number? : ");
            houseNumbers[index] = keyboard.nextInt();
        }

        //----Ages two dimensional array
        for (row = 0; row < houseNumbers.length; row++) {
            System.out.print("\nHow many people live in number " + houseNumbers[row] + ": ");
            numPeople = keyboard.nextInt();
            houseAges[row]= new int [numPeople];
            for (column = 0; column < numPeople; column++) {
                System.out.print("What is the age of person " + (column + 1) + ": ");
                houseAges[row][column] = keyboard.nextInt();
            }
        }

        computeAndPrint(houseNumbers, houseAges);
    }
//----Analysing data
        private static void computeAndPrint (int[] singleArray, int[][] duoArray) {

            int age;
            int totalAge = 0;
            int grandTotalAge = 0;
            int row, column;

            for (row = 0; row < singleArray.length; row ++) {
                for (column = 0; column < duoArray[row].length; column++) {
                    age = duoArray[row][column];
                    totalAge += age;
                }
                System.out.println("House " + singleArray[row] + " has a total age of " + totalAge);
                grandTotalAge += totalAge;
                totalAge = 0;
            }

            System.out.print("\nThe street has a total age of " + grandTotalAge);

        }

    }


