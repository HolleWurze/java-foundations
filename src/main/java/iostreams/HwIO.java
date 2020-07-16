package iostreams;

import java.io.*;

public class HwIO {
    public static void main(String[] args) {
        //1_____________________________________________1

        UserHw user = new UserHw("George", "12345");
        try (ObjectOutput objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/user.out"))) {
            objectOutputStream.writeObject(user);
            objectOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/user.out"))){
           UserHw userFromFile = (UserHw) objectInputStream.readObject();
            System.out.println(userFromFile.getLogin());
            System.out.println(userFromFile.getPassword());


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2_____________________________________________2
        File file1 = new File("src/main/resources/HwFile1.txt");
        File file2 = new File("src/main/resources/HwFile2.txt");
        File tmpFile = new File("src/main/resources/HwTmp.txt");

        try (PrintWriter printInFile1 = new PrintWriter(file1)) {
            printInFile1.println("Privet 3 string in file");
            printInFile1.println("Privet 2 string in file");
            printInFile1.println("Privet 1 string in file");
            printInFile1.println("Privet 0 string in file");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (PrintWriter printInFile2 = new PrintWriter(file2)) {
            printInFile2.println("Privet 1 string in file");
            printInFile2.println("Privet 2 string in file");
            printInFile2.println("Privet 3 string in file");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        file1.renameTo(new File("src/main/resources/HwTmp.txt"));
        file2.renameTo(new File("src/main/resources/HwFile1.txt"));
        tmpFile.renameTo(new File("src/main/resources/HwFile2.txt"));

        //3_____________________________________________3
        File file = new File("src/main/resources/HWmemory.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < 10; i++) {
                input = bufferedReader.readLine();
                printWriter.print(input + "\n");
                printWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
