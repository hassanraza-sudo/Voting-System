import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

class VoterLogin extends JFrame {
    public JPanel VotersLogin;
    private JLabel UserName;
    private JLabel passWord;
    private JButton logInButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel mainpanel;
    private JLabel titlelbl;

    public VoterLogin() {
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cnic = textField1.getText();
                String pass = String.valueOf(passwordField1.getPassword());

                File file = new File("Database.txt");
                System.out.println(file);
                try {
                    Scanner sc = new Scanner(file);
                    if(pass.equals("Admin")) {
                        Foo:
                        while (true) {

                            while (sc.hasNext()) {
                                if (sc.next().equals(cnic)) {
                                    VoterLogin.super.dispose();
                                    Dashboard d = new Dashboard();
                                    d.setContentPane(d.DashboardPanel);
                                    d.setVisible(true);
                                    d.setSize(600, 500);
                                    d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    break Foo;
                                }
//                                System.out.println("Inner loop");
                            }
                            if (sc.hasNextLine())
                                sc.nextLine();
//                            System.out.println("Outer Loop");
                            if (!sc.hasNextLine()) {
                                JOptionPane.showMessageDialog(null, "Incorrect CNIC");
                                break;
                            }
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Incorrect Password");
                    }

                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainpanel = new JPanel();
        mainpanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        VotersLogin = new JPanel();
        VotersLogin.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 4, new Insets(0, 0, 0, 0), -1, -1));
        VotersLogin.setBackground(new Color(-16777216));
        Font VotersLoginFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.BOLD, 24, VotersLogin.getFont());
        if (VotersLoginFont != null) VotersLogin.setFont(VotersLoginFont);
        mainpanel.add(VotersLogin, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        titlelbl = new JLabel();
        titlelbl.setBackground(new Color(-10285582));
        Font titlelblFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.BOLD, 36, titlelbl.getFont());
        if (titlelblFont != null) titlelbl.setFont(titlelblFont);
        titlelbl.setForeground(new Color(-589830));
        titlelbl.setHorizontalAlignment(0);
        titlelbl.setHorizontalTextPosition(0);
        titlelbl.setText(" LOGIN FORM");
        VotersLogin.add(titlelbl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        UserName = new JLabel();
        Font UserNameFont = this.$$$getFont$$$("Arial", Font.BOLD, 20, UserName.getFont());
        if (UserNameFont != null) UserName.setFont(UserNameFont);
        UserName.setForeground(new Color(-589830));
        UserName.setHorizontalAlignment(0);
        UserName.setHorizontalTextPosition(0);
        UserName.setText("Username");
        VotersLogin.add(UserName, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        passWord = new JLabel();
        Font passWordFont = this.$$$getFont$$$("Arial", Font.BOLD, 0, passWord.getFont());
        if (passWordFont != null) passWord.setFont(passWordFont);
        passWord.setText("Password");
        VotersLogin.add(passWord, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Arial", Font.BOLD, 20, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-589830));
        label1.setText("Password");
        VotersLogin.add(label1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        logInButton = new JButton();
        logInButton.setBackground(new Color(-262149));
        Font logInButtonFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.BOLD, 18, logInButton.getFont());
        if (logInButtonFont != null) logInButton.setFont(logInButtonFont);
        logInButton.setForeground(new Color(-16777216));
        logInButton.setText("Log in");
        VotersLogin.add(logInButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField1 = new JTextField();
        textField1.setBackground(new Color(-589830));
        textField1.setForeground(new Color(-6335309));
        VotersLogin.add(textField1, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        passwordField1 = new JPasswordField();
        VotersLogin.add(passwordField1, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainpanel;
    }
}

public class loginMain
{
    public static void main (String args[])
    {
        VoterLogin vl = new VoterLogin();
        vl.setContentPane(vl.VotersLogin);
        vl.setVisible(true);
        vl.setSize(600,500);
        vl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}

