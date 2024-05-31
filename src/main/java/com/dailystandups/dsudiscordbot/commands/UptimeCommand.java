package com.dailystandups.dsudiscordbot.commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
public class UptimeCommand implements MessageCreateListener {

    @Autowired
    Instant startTime;
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if(event.getMessageContent().equalsIgnoreCase("!uptime")){
            Instant now = Instant.now();
            // https://stackoverflow.com/a/55780162/12369650
            Duration uptime = Duration.between(startTime, now);
            var message = String.format("Days: %d, Hours: %d, Minutes: %d", uptime.toDaysPart(), uptime.toHoursPart(), uptime.toMinutesPart());
            event.getChannel().sendMessage(message);
        }
    }
}
