package by.itacademy.nataliyabaravuliya.javabasics;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1000);
        System.out.println(num);
    }

  //  class RandomNumber1 {
    //    public int getRandomNumNextInt() {
    //        Random random = new Random();
    //        return random.nextInt();
      //  }
   // }
}
