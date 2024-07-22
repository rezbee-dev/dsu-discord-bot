package com.dailystandups.dsudiscordbot.interactions;

import org.javacord.api.interaction.SlashCommandBuilder;
import org.javacord.api.listener.interaction.SlashCommandCreateListener;

public abstract class BaseSlashCommand implements SlashCommandCreateListener {
    public abstract SlashCommandBuilder getSlashCommandBuilder();
}
