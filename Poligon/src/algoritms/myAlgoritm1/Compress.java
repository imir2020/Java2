package algoritms.myAlgoritm1;

import java.io.*;
import java.util.Arrays;
import java.util.Random;


/*
For compress generate info before record it in file.txt
 */
public class Compress {
    private static final int SIZE = 128;
    private Dictionary dict;

    //generate info in this method
    public void generateInfo() {
        File file = new File("src/algoritms/myAlgoritm1/RandomInfo.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(generateOfRandom());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readInfo() {
        String temp = "";//Заменить String на StringBuilder для увеличения скорости
        File file = new File("src/algoritms/myAlgoritm1/RandomInfo.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                //48 is 0, 49 is 1
                if (c == 49) temp += String.valueOf(1);
                if (c == 48) temp += String.valueOf(0);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }

    public void writeInfo() {
        try {
            FileWriter fileWriter = new FileWriter("src/algoritms/myAlgoritm1/InfoOfCompress.txt");

            //48 is 0, 49 is 1
            fileWriter.write(compress());
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    //Теперь нужен метод, который будет сжимать данные
    public String compress() {
        String temp = "";
         dict = new Dictionary();
        int count = 0;
        int halfBite = 4;
        int i = 0;
        String[] buff = new String[halfBite];//Заменить на конкатенацию строки, причём заменить на метод  StringBuilder.append()
        String str = readInfo();

        while (i < str.length()) {
            buff[count++] = String.valueOf(str.charAt(i));//

            if (count == halfBite) {
                String likeKey = "";
                for (int j = 0; j < buff.length; j++) {
                    likeKey += buff[j];
                }
                //System.out.println(likeKey + " key");
                temp += dict.getDictionary().get(likeKey);//Заменить на конкатенацию строки, причём заменить на метод  StringBuilder.append()
                // System.out.println(temp + " temp");
                //  System.out.println(Arrays.toString(buff) + " 1");//test
                for (int j = 0; j < halfBite; j++) {
                    buff[j] = null;
                }
                count = 0;
            }
            i++;
        }
        System.out.println(temp + " 2");//test
        return temp;
    }


    String generateOfRandom() {
        String randInt = "";
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            int random = rand.nextInt(2);
            randInt += Integer.toBinaryString(random);
        }
        return randInt;
    }

    public static void main(String[] args) {
        Compress compress = new Compress();
        compress.generateInfo();
        compress.readInfo();
        compress.compress();
        compress.writeInfo();
    }
}
