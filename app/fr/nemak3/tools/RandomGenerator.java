package fr.nemak3.tools;


import java.util.Random;

public class RandomGenerator {

  public static int generateInt() {
    return new Random().nextInt();
  }

  public static int generateInt(int min, int max) {
    return (int)(Math.random() * (max - min)) + min;
  }

  public static double generateDouble() {
    return new Random().nextDouble();
  }

  public static double generateDouble(double min, double max) {
    return (double)(Math.random() * (max - min)) + min;
  }
}
