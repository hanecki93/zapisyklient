package sdpwj.gui;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;



public class TimeCounter {
    Timer timer;
 
    public TimeCounter(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }
 
    class RemindTask extends TimerTask {
        public void run() {
          
            try {
            	if(ZapisyKlientGUI.socket.isClosed()==false)
				{ZapisyKlientGUI.socket.close();
				ZapisyKlientGUI.btnZapisz.setEnabled(false);
				ZapisyKlientGUI.label.setText("Koniec czasu");}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            timer.cancel(); //Wy³¹czamy taska
        }
    }
}