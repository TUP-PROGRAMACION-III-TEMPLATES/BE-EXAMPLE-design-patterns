package ar.edu.utn.frc.tup.p4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ActionInterpreter {

    // Simple parser that maps commands to expressions and executed.
    public static Map<String, Expression> parse(String command, PlaybackContext context) {
        String[] parts = command.split(" ");
        Map<String, Expression> expressions = new HashMap<>();

        if (Objects.equals(parts[0], "play")) {
            // Assumes a command format like: "play 'song title'"
            String songName = command.substring(command.indexOf("'") + 1, command.lastIndexOf("'"));
            expressions.put("play", new PlayExpression(songName));
        } else if (Objects.equals(parts[0], "volume")) {
            int volume = Integer.parseInt(parts[1]);
            expressions.put("volume", new VolumeExpression(volume));
        } else if (Objects.equals(parts[0], "pause")) {
            expressions.put("pause", new PauseExpression());
        } else if (Objects.equals(parts[0], "stop")) {
            expressions.put("stop", new StopExpression());
        }

        return expressions;
    }
}
