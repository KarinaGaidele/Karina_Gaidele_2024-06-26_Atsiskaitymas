package utils;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomUserName() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Karina";
    }
    public static String generateRandomPass() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Daugtaskis";

    }

    public static String generateRandomUserName1() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Karina";
    }
    public static String generateRandomPass1() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Daugtaskis";
}}