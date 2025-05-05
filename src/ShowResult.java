import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

class ShowResult extends JFrame {
    JLabel mqm;
    JLabel pti;
    JLabel noon;

    JLabel noonLabel = new JLabel("PMLN");
    JLabel ptiLabel = new JLabel("PTI");
    JLabel mqmLabel = new JLabel("MQM");

    ShowResult() throws FileNotFoundException {
        Filing filing = new Filing();
        mqm = new JLabel();
        pti = new JLabel();
        noon = new JLabel();

        int mqmVote = filing.getVote("mqm");
        int noonVote = filing.getVote("noon");
        int ptiVote = filing.getVote("pti");

        mqm.setText(String.valueOf(mqmVote));
        noon.setText(String.valueOf(noonVote));
        pti.setText(String.valueOf(ptiVote));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Election Results");
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(mqmLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(mqm, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(ptiLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(pti, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(noonLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(noon, gbc);

        mqmLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mqm.setFont(new Font("Arial", Font.BOLD, 20));
        ptiLabel.setFont(new Font("Arial", Font.BOLD, 20));
        pti.setFont(new Font("Arial", Font.BOLD, 20));
        noonLabel.setFont(new Font("Arial", Font.BOLD, 20));
        noon.setFont(new Font("Arial", Font.BOLD, 20));

        mqm.setForeground(Color.BLUE);
        pti.setForeground(Color.RED);
        noon.setForeground(Color.GREEN);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
    }
}
