package ru.progwards.java2.lessons.recursion;

public class AsNumbersSum {
   static int m = 1;

//Доработать!!!
// Нужны два метода - один возвращает убывающие значения, а второй наоборот, - добавляет к ним по единице
    // этот метод генерирует убывающие цифры
//    public static String asNumbersSum(int number) {//, int k
//        if (number == 1) {
//            return Integer.toString(1);//String.valueOf(number);
//        }
//
//        return number + " = " + asNumbersSum(number- 1);//
//    }
    public static String asNumbersSum(int number, int m) {//,
        if (number == 0) return String.valueOf(1);
        if (number < m)  return String.valueOf(0);
        if (number == m) return String.valueOf(number%2);
        int sum = 0;
        for (int i = m; i <= number/2 ; ++i) {
            sum += (i%2)*Integer.parseInt(asNumbersSum(number - i, i));
        }
        return String.valueOf(sum +number%2);
    }

    public static void main(String[] args) {
        AsNumbersSum t = new AsNumbersSum();
      // asNumbersSum(3);
        System.out.println(asNumbersSum(8, 1));
        System.out.println(Sou(5, m));
    }
   static int Sou(int n, int m ) {

        if (n == 0) return 1;
        if (n < m)  return 0;
        if (n == m) return n%2;

        int sum = 0;
        for(int k = m; k <= n/2; ++k)
            sum += (k%2)*Sou(n-k,k);
        return sum + n%2;
    }

//    int nf(int x, int k) {
//        if (x == 0)
//            return 1;
//        int res = 0;
//        for (int i = MIN(x, k); i > 0; --i)
//            res += nf(x - i, i);
//        return res;
//    }

    //Попробовать этот метод.
//    unsigned long int Razbienie(unsigned long int n,
//                                unsigned long int k){
//        if(n==1 || k==1)  return 1;
//        if(n<=k)  return Razbienie(n,n-1)+1;
//        return Razbienie(n,k-1)+Razbienie(n-k,k);
//    }
}
