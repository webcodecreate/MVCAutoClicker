import javax.swing.*;
import java.awt.event.ActionListener;

public class ViewClicker extends JFrame {

    private JLabel clicksLabel = new JLabel ("Count of clicks: ");
    private JTextField clicks  = new JTextField(5);
    private JLabel delayLabel = new JLabel ("Delay in ms: ");
    private JTextField delay  = new JTextField(5);
    private JButton button = new JButton("Start after 3 seconds");

    ViewClicker(){

        JPanel AutoClicker = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 100);

        AutoClicker.add(clicksLabel);
        AutoClicker.add(clicks);
        AutoClicker.add(delayLabel);
        AutoClicker.add(delay);
        AutoClicker.add(button);

        this.add(AutoClicker);

    }

    public int getClicks(){

        return Integer.parseInt(clicks.getText());

    }

    public int getDelay(){

        return Integer.parseInt(delay.getText());

    }

    void addClickerListener(ActionListener listenForFirstResultButton){

        button.addActionListener(listenForFirstResultButton);

    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }


}
