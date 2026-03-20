package uwu.sillydevteam.fluxbox;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.util.concurrent.CompletionStage;

public class BotWebSocket {
    HttpClient client = HttpClient.newHttpClient();
    WebSocket ws = (WebSocket) client.newWebSocketBuilder()
            .buildAsync(URI.create(""), new WebSocket.Listener() {
                @Override
                public CompletionStage<?> onText(WebSocket ws, CharSequence data, boolean last) {
                    Fluxbox.LOGGER.info("Received: " + data);
                    // JSON Parsing, opcode handling.
                    ws.request(1);
                    return null;
                }
            });
}
