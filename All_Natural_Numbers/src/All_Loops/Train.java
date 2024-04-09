package All_Loops;




import java.util.Scanner;

public class Train {

    private static final String ENGINE = "ENGINE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trainA = scanner.nextLine();
        String trainB = scanner.nextLine();

        String[] bogiesA = trainA.split(" ");
        String[] bogiesB = trainB.split(" ");

        // Sort the bogies of each train in the ascending order of their names
        bogiesA = sortBogies(bogiesA);
        bogiesB = sortBogies(bogiesB);

        // Print the arrival of Train A and Train B at Hyderabad
        System.out.println("ARRIVAL TRAIN_A " + join(bogiesA, " "));
        System.out.println("ARRIVAL TRAIN_B " + join(bogiesB, " "));

        // Merge the two trains
        String[] bogiesAB = mergeBogies(bogiesA, bogiesB);

        // Print the departure of Train AB from Hyderabad
        System.out.println("DEPARTURE TRAIN_AB " + join(bogiesAB, " "));
    }

    private static String join(String[] strings, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        for (String string : strings) {
            buffer.append(string);
            buffer.append(delimiter);
        }
        return buffer.toString();
    }

    private static String[] sortBogies(String[] bogies) {
        for (int i = 0; i < bogies.length; i++) {
            for (int j = i + 1; j < bogies.length; j++) {
                if (bogies[i].compareTo(bogies[j]) > 0) {
                    String temp = bogies[i];
                    bogies[i] = bogies[j];
                    bogies[j] = temp;
                }
            }
        }
        return bogies;
    }

    private static String[] mergeBogies(String[] bogiesA, String[] bogiesB) {
        String[] bogiesAB = new String[bogiesA.length + bogiesB.length];
        int i = 0;
        int j = 0;
        for (; i < bogiesA.length && j < bogiesB.length; i++, j++) {
            if (bogiesA[i].equals(ENGINE)) {
                bogiesAB[i] = ENGINE;
            } else {
                bogiesAB[i] = bogiesA[i];
            }
            if (bogiesB[j].equals(ENGINE)) {
                bogiesAB[i + 1] = ENGINE;
            } else {
                bogiesAB[i + 1] = bogiesB[j];
            }
        }
        for (; i < bogiesA.length; i++) {
            bogiesAB[i] = bogiesA[i];
        }
        for (; j < bogiesB.length; j++) {
            bogiesAB[i + 1] = bogiesB[j];
        }
        return bogiesAB;
        
    }
    
  
		// TODO Auto-generated method stub

	}

