package rattlesnakeadventure.view;

import javax.swing.*;
import java.util.ArrayList;

public class Top10Window extends Window {
    private ArrayList<Window> windows;

    public Top10Window(ArrayList<Window> windows){
        this.windows = windows;
        this.setVisible(true);
    }

    @Override
    protected void doOnExit() {
        super.doOnExit();
        windows.remove(this);
    }
}