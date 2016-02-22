/**
 * Created by Nastya on 21.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyWindow window1 = new MyWindow(10.5,3.3,1,"Black",false);
        MyWindow window2 = new MyWindow(11.2,2.3,3,"Red", true);
        MyWindow window3 = new MyWindow(14.2,3.3,3,"Broun", true);
        MyWindow window4 = new MyWindow(15.2,5.3,5,"Green", false);
        MyWindow window5 = new MyWindow(13.2,6.3,4,"White", true);
        MyWindow[] arrayWindow =  {window1,window2,window3,window4,window5};
        for(int i = 0;i<5;i++){
            arrayWindow[i].printFields();

        }
    }

}
