package com.dailystandups.dsudiscordbot.commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import org.springframework.stereotype.Component;

@Component
public class PingCommand implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase("!ping")) {
            event.getChannel().sendMessage("Pong!");
        }
    }
}
