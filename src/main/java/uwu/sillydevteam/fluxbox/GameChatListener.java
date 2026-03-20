package uwu.sillydevteam.fluxbox;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.ServerChatEvent;

public class GameChatListener {
    @SubscribeEvent
    public void ChatMessageEvent(ServerChatEvent event) {
        if (event.isCanceled()) return;
    }
}
