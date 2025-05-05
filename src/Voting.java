import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Voting extends JFrame{
    public JPanel mainPanel;
    private JPanel MainArea;
    private JLabel Mainlbl;
    private JLabel Results;
    private JLabel Regitration;
    private JLabel Login;
    private JButton REGISTRATIONButton;
    private JButton LOGINButton;
    private JButton RESULTSButton;

    public Voting() {
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Voting.super.dispose();
                VoterLogin vl = new VoterLogin();
                vl.setContentPane(vl.VotersLogin);
                vl.setVisible(true);
                vl.setSize(600,500);
                vl.setLocationRelativeTo(null);
                vl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        REGISTRATIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Voting.super.dispose();
                Vote vote=new Vote();
                vote.setContentPane(vote.mainPanel);
                vote.setSize(600,450);
                vote.setVisible(true);
                vote.setLocationRelativeTo(null);
                vote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        RESULTSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowResult vr = null;
                try {
                    vr = new ShowResult();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

                vr.setLocationRelativeTo(null);
                vr.setVisible(true);
                vr.setSize(600,450);
                vr.setLocationRelativeTo(null);
                vr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        /*clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file=new File("VoteCount.txt");
                try {
                    Scanner sc=new Scanner(file);
                    System.out.println(sc.next());
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });*/
    }

    public static void main(String[] args) {
        Voting v=new Voting();
        v.setContentPane(v.mainPanel);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
