package leagueofcrafters;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundEvent {
	@ForgeSubscribe
	public void onSoundLoad(SoundLoadEvent event) {
		event.manager.addSound("league:teemo.ogg");
		// event.manager.addSound("league:ziggs.ogg");

	}
}
