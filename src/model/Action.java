package model;

import java.awt.Graphics2D;

public interface Action {
        public int pickUpKey();
        public void pickUpItems();
        public void run(String direction);
}
