package algoritms.myAlgoritm1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
Помимо методов свёртки строки, нужно изготовить небольшой класс, который бы сжимал бы данные из файла
с помощью классического алгоритма сжатия,  и так же делал бы то же самое с помощью предварительной свёртки строк файла, а затем
применял алгоритм сжатия. После чего можно замерить степень сжатия случайной инфы, а затем и текстовой.
 */

public class Algo {
    private int rawSize;
    List<String> listOfRandom = new ArrayList<>();
    List<String> mixOfRandom = new ArrayList<>();


    public Algo(int rawSize) {
        this.rawSize = rawSize;
    }

    String generateOfRandom() {
        String randInt = "";
        Random rand = new Random();
        for (int i = 0; i < rawSize; i++) {
            int random = rand.nextInt(2);
            randInt = Integer.toBinaryString(random);
            listOfRandom.add(randInt);
        }
        return randInt;
    }

    void mixIntFromList() {//List<String>
        if (rawSize == 0) return;
        int k = 1;
        for (int i = 0; i <= (rawSize / 2); i++) {
            mixOfRandom.add(listOfRandom.get(i));
        }

        for (int j = rawSize - 1; j > (rawSize / 2); j--) {
            mixOfRandom.add(k, listOfRandom.get(j));
            k += 2;
        }
    }

    public static void main(String[] args) {
        Algo algo = new Algo(10);
        algo.generateOfRandom();

        System.out.println("Entropy");

        for (String str : algo.listOfRandom) {
            System.out.print(str);//+ " one "
        }

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Order");

        algo.mixIntFromList();
        for (String str : algo.mixOfRandom) {
            System.out.print(str);//+ " two "
        }
    }
}
