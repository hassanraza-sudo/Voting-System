import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Filing {
    /*void codeToFIle(ArrayList list) throws IOException {
        for(int i=0; i<list.size(); i++){

            FileWriter fw = new FileWriter("Database.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print(list.get(i).);
            pw.flush();
            pw.close();
            fw.close();
        }
    }*/
    int getVote(String name) throws FileNotFoundException {
        File file = new File("votes\\" + name + ".txt");
        Scanner scanner = new Scanner(file);
        int x = Integer.parseInt(scanner.next());
        return x;
    }
    void saveVote(String name, boolean increase) throws IOException {
        File file = new File("votes\\" + name + ".txt");

        Scanner scanner = new Scanner(file);
        int x = Integer.parseInt(scanner.next());
        System.out.println("Current vote: " + x);
        if (increase) {
            x = x + 1;
        } else {
            x = x - 1;
            JOptionPane.showMessageDialog(null, "Vote deleted");
        }

        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(Integer.toString(x));
        bw.close();
        fw.close();
        System.out.println("Vote casted: " + x);

    }


    void codeToFile(String fName, String lName, String gender, String birthDate, String Phone, String email, String NIC, String address) throws IOException {
        File file=new File("Database.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(fName+" "+lName+" "+gender+" "+birthDate+" "+Phone+" "+email+" "+NIC+" "+address);
        bw.newLine();
        bw.close();
        fw.close();
    }
}
