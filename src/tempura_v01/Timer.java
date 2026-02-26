package tempura_v01;
import java.util.Scanner;

import javax.sound.midi.MidiUnavailableException;

public class Timer {

	public static void main(String[] args) throws InterruptedException, MidiUnavailableException {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("¿Cuantos Minutos?");
		int mn = tec.nextInt();
		int sg = mn * 60;
		
		Bell.play();
		
		for (int t = sg; t > 0; t--) {
			int m = t / 60;
			int s = t % 60;
			System.out.printf("\r%02d:%02d", m, s);
			System.out.flush();
			
			Thread.sleep(1000);
		}
		
		System.out.println("\rMeditación Finalizada");
		Bell.play();
		tec.close();
	}

}
