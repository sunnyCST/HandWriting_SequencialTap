package com.pcg.lu.sequential_tap;

import java.util.ArrayList;

public class QSequential {
    public ArrayList<QTap> qTaps;
    public String tapName;
    public boolean setup;

    public QSequential(){
        qTaps = new ArrayList();
        tapName = null;
        setup = false;
    }
}
