import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Vote extends JFrame{
    public JPanel mainPanel;
    private JLabel Formlab;
    private JTextField tfFName;
    private JTextField tfLName;
    private JTextField tfDateOfBirth;
    private JTextField tfGender;
    private JTextField tfPhone;
    private JLabel FNlab;
    private JLabel LNlab;
    private JLabel Datelab;
    private JLabel Genderlab;
    private JLabel PhNolab;
    private JTextField tfNIC;
    private JTextField tfAddress;
    private JTextField tfEmail;
    private JLabel Cniclab;
    private JLabel HaddLab;
    private JLabel Eaddlab;
    private JButton sbtBtn;

    public Vote() {
        sbtBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fName=tfFName.getText();
                String lName=tfLName.getText();
                String birthDate=tfDateOfBirth.getText();
                String gender=tfGender.getText();
                String phone=tfPhone.getText();
                String NIC=tfNIC.getText();
                String email=tfEmail.getText();
                String address=tfAddress.getText();
                Filing filing=new Filing();
                try {
                    filing.codeToFile(fName, lName, gender, birthDate, phone, email, NIC, address);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                Vote.super.dispose();
                Voting v=new Voting();
                v.setContentPane(v.mainPanel);
                v.pack();
                v.setVisible(true);
                v.setLocationRelativeTo(null);
                v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }

    public static void main(String[] args) {
        Vote vote=new Vote();
        vote.setContentPane(vote.mainPanel);
        vote.pack();
        vote.setLocationRelativeTo(null);
        vote.setVisible(true);
        vote.setLocationRelativeTo(null);
        vote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
