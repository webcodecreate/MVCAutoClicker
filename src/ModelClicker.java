import java.awt.*;
import java.awt.event.InputEvent;

public class ModelClicker {

    private Robot robot;

    private int delay;

    public ModelClicker() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickMouse(int button) {
        try {
            robot.mousePress(button);
            robot.delay(1);
            robot.mouseRelease(button);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDelay(int ms) {
        this.delay = ms;
    }

    public void autoClicker(int clicks, int delay){

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ModelClicker clicker = new ModelClicker();
        clicker.setDelay(delay);

        for (int i = 0; i < clicks; i++) {
            clicker.clickMouse(InputEvent.BUTTON1_MASK);
        }

    }

}
