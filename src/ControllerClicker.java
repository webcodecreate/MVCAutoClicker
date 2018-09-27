import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerClicker {

    private ViewClicker theView;
    private ModelClicker theModel;

    public ControllerClicker(ViewClicker theView, ModelClicker theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addClickerListener(new ClickerListener());
    }

    class ClickerListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int clicks = 0;
            int delay = 0;

            try{

                clicks = theView.getClicks();
                delay = theView.getDelay();

                theModel.autoClicker(clicks, delay);

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("Enter any string in first line.");

            }

        }

    }
}
