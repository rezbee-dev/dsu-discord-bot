package com.dailystandups.dsudiscordbot.interactions;

import org.javacord.api.event.interaction.SlashCommandCreateEvent;
import org.javacord.api.interaction.SlashCommandInteraction;
import org.javacord.api.listener.interaction.SlashCommandCreateListener;
import org.springframework.stereotype.Component;

@Component
public class PingSlashCommand implements SlashCommandCreateListener {

    @Override
    public void onSlashCommandCreate(SlashCommandCreateEvent event){
        SlashCommandInteraction interaction = event.getSlashCommandInteraction();
        if(interaction.getCommandName().equals("ping")) {
            //
        }
    }
}
