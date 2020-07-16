package exceptions;


public class ExceptionsHw {
    public static void main(String[] args) {

        try {
            exceptionMethod();
        } catch (Exception e) {
            nextExceptionMethod();
        } finally {
            System.out.println("Даже здесь радует глаз! (finally)");
        }

        try {
            Person marina = new Person("Marina",21);
        } catch (hwMyException excAge){
            excAge.printStackTrace();
        }
    }

    private static void nextExceptionMethod() {
        try {
            exceptionMethod();
        } catch (Exception e) {
            System.out.println("Мы ее пробросили и обработали (catch) - " + e.getMessage());
        } finally {
            System.out.println("Будет радовать глаз всегда, даже когда ошибки нет (finally)");
        }
    }

    private static void exceptionMethod() throws Exception{
        throw new Exception("Какая-то ошибка");
    }
}


