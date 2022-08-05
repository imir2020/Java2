package algoritms.myAlgoritm1;

import java.io.*;


/*
For compress generate info before record it in file.txt
 */
public class Compress {
    private static final int SIZE = 1000;

    //generate info in this method
    public void writeInfo() {
        File file = new File("src/algoritms/myAlgoritm1/RandomInfo.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(generateOfRandom());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAndCompressInfo() {
        File file = new File("src/algoritms/myAlgoritm1/RandomInfo.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            String temp = "";
            while ((c = fileReader.read()) != -1) {
                System.out.println(c);//48 is 0, 49 is 1
                temp += String.valueOf(c);

            }

            FileWriter fileWriter = new FileWriter("src/algoritms/myAlgoritm1/InfoOfCompress.txt");

            //48 is 0, 49 is 1
            fileWriter.write(temp);
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Теперь нужен метод, который буде сжимать данные



    //Теперь нужен метод№2, который буде смешивать и сжимать данные


    String generateOfRandom() {
        String randInt = "";
        for (int i = 0; i < SIZE; i++) {
            int random = (int) (Math.random() * 10);
            randInt += Integer.toBinaryString(random);
        }
        return randInt;
    }

    public static void main(String[] args) {
        Compress compress = new Compress();
        compress.generateOfRandom();
        compress.writeInfo();
        compress.readAndCompressInfo();
    }
}
