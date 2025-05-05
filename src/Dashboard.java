import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Dashboard extends JFrame {
    private JLabel Dashboard;
    private JButton addVoteButton;
    private JButton removeVoteButton;
    private JButton logoutButton;
    public JPanel mainPanelD;
    public JPanel DashboardPanel;

    public Dashboard() {
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dashboard.super.dispose();
                VoterLogin vl = new VoterLogin();
                vl.setContentPane(vl.VotersLogin);
                vl.setVisible(true);
                vl.setSize(600, 500);
                vl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        addVoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addVoteButton.setEnabled(false);
                removeVoteButton.setEnabled(true);
                SelctionNew sn = new SelctionNew();
                sn.setContentPane(sn.MyPanel);
                sn.setVisible(true);
                sn.setSize(600,500);
                sn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

        });
        removeVoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Filing filing = new Filing();
                try {
                    filing.saveVote(VoteInfo.party, false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                SelctionNew.decreaseVoteCount();
                JOptionPane.showMessageDialog(null, "Your Vote Has Been Removed");
                removeVoteButton.setEnabled(false);
                addVoteButton.setEnabled(true);
            }
        });

    }

    public static void main(String args[]) {


        Dashboard d = new Dashboard();
        d.setContentPane(d.mainPanelD);
        d.setVisible(true);
        d.setSize(600, 500);
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    private class GridLayoutManager implements LayoutManager {
        public GridLayoutManager(int i, int i1, Insets insets, int i2, int i3) {
        }

        @Override
        public void addLayoutComponent(String name, Component comp) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        @Override
        public void layoutContainer(Container parent) {

        }
    }
}

