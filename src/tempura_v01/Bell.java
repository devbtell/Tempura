package tempura_v01;

import javax.sound.midi.*;

public class Bell {

	public static void play() throws InterruptedException, MidiUnavailableException {
		
		Synthesizer midi = MidiSystem.getSynthesizer();
		midi.open();
		
		MidiChannel[] canal = midi.getChannels();
		/* instrumento */
		canal[0].programChange(11);
		/* nota musical */
		canal[0].noteOn(60, 100);
		Thread.sleep(2000);
		canal[0].noteOff(60);
		
		midi.close();
		
	}
}
