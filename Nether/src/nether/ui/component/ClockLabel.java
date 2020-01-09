package nether.ui.component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;

/**
 * This class is intended to become a label that displays a clock within.
 *
 * @author Héctor
 */
public class ClockLabel extends JLabel implements Runnable {

    private final Thread dateThread;

    public ClockLabel() {
        this.dateThread = new Thread(this);
        this.dateThread.start();
    }

    @Override
    public void run() {

        for (;;) {
 
            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime currentDateTime = LocalTime.now();

            setText(currentDateTime.format(timeFormat));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}
