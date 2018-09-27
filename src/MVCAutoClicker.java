public class MVCAutoClicker {
    public static void main(String[] args) {
        ViewClicker theView = new ViewClicker();

        ModelClicker theModel = new ModelClicker();

        ControllerClicker theController = new ControllerClicker(theView,theModel);

        theView.setVisible(true);
    }
}
