package com.dailystandups.dsudiscordbot.interactions;

import org.javacord.api.event.interaction.SlashCommandCreateEvent;
import org.javacord.api.interaction.SlashCommandBuilder;
import org.javacord.api.interaction.SlashCommandInteraction;
import org.springframework.stereotype.Component;

@Component
public class PingSlashCommand extends BaseSlashCommand {

    @Override
    public SlashCommandBuilder getSlashCommandBuilder(){
        return new SlashCommandBuilder().setName("ping").setDescription("pong");
    }

    @Override
    public void onSlashCommandCreate(SlashCommandCreateEvent event){
        SlashCommandInteraction interaction = event.getSlashCommandInteraction();
        if(interaction.getCommandName().equals("ping")) {
            interaction
                    .createImmediateResponder()
                    .setContent("pong!")
                    .respond();
        }
    }
}
