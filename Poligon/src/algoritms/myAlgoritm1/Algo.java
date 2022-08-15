package algoritms.myAlgoritm1;

import java.util.ArrayList;
import java.util.List;
/*
Помимо методов свёртки строки, нужно изготовить небольшой класс, который бы сжимал бы данные из файла
с помощью классического алгоритма сжатия,  и так же делал бы то же самое с помощью предварительной свёртки строк файла, а затем
применял алгоритм сжатия. После чего можно замерить степень сжатия случайной инфы, а затем и текстовой.
 */

public class Algo {
    private int rawSize = 100;
    List<String> listOfRandom = new ArrayList<>();
    List<String> mixOfRandom = new ArrayList<>();

    public Algo() {
    }

    public Algo(int rawSize) {
        this.rawSize = rawSize;
    }

    void generateOfRandom() {
        if (rawSize == 0) return;
        for (int i = 0; i < rawSize; i++) {
            int random = (int) (Math.random() * 10);

            String randInt = Integer.toBinaryString(random);
            listOfRandom.add(i, randInt);
        }
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
        System.out.println();
        System.out.println("------------------------------------------");
        algo.mixIntFromList();
        for (String str : algo.mixOfRandom) {
            System.out.print(str);//+ " two "
        }
    }
}
