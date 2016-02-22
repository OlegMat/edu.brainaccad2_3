/**
 * Created by Nastya on 21.02.2016.
 */
public class MyWindow {

        private double width;
        private double height;
        private int numberOfGlass;
        private String color;
        private boolean isOpen;


        public MyWindow(double width, double height) {
            this.width = width;
            this.height = height;

        }

        public MyWindow(double width, double height, int numberOfGlass) {
            this(width, height);
            this.width = width;
            this.height = height;
            this.numberOfGlass = numberOfGlass;
        }

        public MyWindow(double width, double height, int numberOfGlass, String color) {
            this(width, height, numberOfGlass);
            this.numberOfGlass = numberOfGlass;
            this.color = color;
        }


        public MyWindow(double width) {
            this(width, 5, 2, "white", false);
            this.width = width;
        }

        public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
            this.width = width;
            this.height = height;
            this.numberOfGlass = numberOfGlass;
            this.color = color;
            this.isOpen = isOpen;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public int getNumberOfGlass() {
            return numberOfGlass;
        }

        public String getColor() {
            return color;
        }

        public boolean isOpen() {
            return isOpen;
        }

        public void printFields() {

            System.out.println(getWidth() + " " + getHeight() + " " + getNumberOfGlass() + " " + getColor() + " " + isOpen());

        }
    }

