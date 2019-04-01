package sdpwj.gui;

public class czyMiejsceWWybranych {
	
	static void czyMiejsca(int iloscPrzedmiotow){

int[] t = {0,0,0,0,0,0,0,0};
boolean czyUjemna =false;

		if ((iloscPrzedmiotow>0)&& (Integer.valueOf(ZapisyKlientGUI.textField_2.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[0]=-1;
		

		} else {
			
			t[0]=0;
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
			
		}
		
		if ((iloscPrzedmiotow>1)&& (Integer.valueOf(ZapisyKlientGUI.textField_3.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[1]=-1;
		} else {
		
			t[1]=0;
			
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
		}

		
		if ((iloscPrzedmiotow>2)&& (Integer.valueOf(ZapisyKlientGUI.textField_4.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[2]=-1;
		} else {

			t[2]=0;
			
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
		}

		
		if ((iloscPrzedmiotow>3)&& (Integer.valueOf(ZapisyKlientGUI.textField_5.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[3]=-1;
		} else {
			t[3]=0;
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
		}

		
		if ((iloscPrzedmiotow>4)&& (Integer.valueOf(ZapisyKlientGUI.textField_6.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[4]=-1;
		} else {

			t[4]=0;
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
		}

		
		if ((iloscPrzedmiotow>5)&& (Integer.valueOf(ZapisyKlientGUI.textField_7.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[5]=-1;
		} else {
			t[5]=0;
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
		}

		
		if ((iloscPrzedmiotow>6)&& (Integer.valueOf(ZapisyKlientGUI.textField_8.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[6]=-1;
		} else {
			t[6]=0;
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
		}

		
		if ((iloscPrzedmiotow>7)&& (Integer.valueOf(ZapisyKlientGUI.textField_9.getText()) ==0)) {
			ZapisyKlientGUI.btnZapisz.setEnabled(false);
			ZapisyKlientGUI.label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
			t[7]=-1;
		} else {
			t[7]=0;
			for(int i=0;i<=7;i++) {
				if(t[i]==-1)czyUjemna=true;
			}
			if(czyUjemna==false)
			{ZapisyKlientGUI.btnZapisz.setEnabled(true);
			ZapisyKlientGUI.label.setText("");}
		}


	
	}
}
