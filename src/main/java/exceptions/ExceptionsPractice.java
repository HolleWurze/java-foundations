package exceptions;

import lombok.SneakyThrows;

public class ExceptionsPractice {
    public static void main(String[] args) {
//        throw new RuntimeException("Привет!");

//        try {
//            throw new Exception("Hola, Exception!");
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        try {
//            excteptionMethod();
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        excteptionMethodSneakyThrows();

//        try {
//            throw new IOException();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.err.println("IO");
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.err.println("Exc");
//            e.printStackTrace();
//        }
//        try {
//            Child marusia = new Child("Маруся",-10);
//        } catch (myException){
//
//        }
    }

    public static void excteptionMethod() throws Exception {
        throw new Exception("Hola, Exception!");
    }

    @SneakyThrows
    public static void excteptionMethodSneakyThrows() {
        throw new Exception("Hola, Exception!");
    }
}
