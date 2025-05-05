import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class SelctionNew extends JFrame{
    public JPanel MyPanel;
    private JButton PMLNButton;
    private JButton MQMButton;
    private JButton PTIButton;
    private JButton EXITButton;
    static int voteCount=0;
    public static int getVoteCount(){return voteCount;}
    public static void decreaseVoteCount(){voteCount--;}
    public void toFile() throws IOException {
        File file=new File("VoteCount.txt");
        try {
            Scanner sc=new Scanner(file);
            int voteCount = Integer.parseInt(sc.next());
            System.out.println("VoteCount = "+sc.next());

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
//        File file1=new File("VoteCount.txt");
        FileWriter fw = new FileWriter("VoteCount.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("2");
        System.out.println("Vote Count: " + voteCount);
    }

    public SelctionNew() {
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelctionNew.super.dispose();
                Dashboard d = new Dashboard();
                d.setContentPane(d.mainPanelD);
                d.setVisible(true);
                d.setSize(600, 500);
                d.setLocationRelativeTo(null);
                d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        PMLNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Filing filing = new Filing();
                try {
                    filing.saveVote("noon", true);
                    VoteInfo.party = "noon";
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(null, "Vote Casted to "+e.getActionCommand());
                SelctionNew.super.dispose();
            }
        });
        MQMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Filing filing = new Filing();
                try {
                    filing.saveVote("mqm", true);
                    VoteInfo.party = "mqm";
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(null, "Vote Casted to "+e.getActionCommand());
                SelctionNew.super.dispose();
                /*Dashboard d = new Dashboard();
                d.setContentPane(d.mainPanelD);
                d.setVisible(true);
                d.setSize(600, 500);
                d.setLocationRelativeTo(null);
                d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
            }
        });
        PTIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Filing filing = new Filing();
                try {
                    filing.saveVote("pti", true);
                    VoteInfo.party = "pti";
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(null, "Vote Casted to "+e.getActionCommand());
                SelctionNew.super.dispose();
            }
        });
    }


    public static void main(String[] args) {
        SelctionNew sn = new SelctionNew();
        sn.setContentPane(sn.MyPanel);
        sn.setVisible(true);
        sn.setSize(600,500);
        sn.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
