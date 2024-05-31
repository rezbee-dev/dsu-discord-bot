package com.dailystandups.dsudiscordbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;
import org.javacord.api.listener.message.MessageCreateListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.List;

@Configuration
public class DiscordBot {

    @Autowired
    Environment env;

    @Autowired
    List<MessageCreateListener> commands;

    @Bean
    public DiscordApi start() {
        var api = new DiscordApiBuilder()
                .setToken(env.getProperty("BOT_TOKEN"))
                .setWaitForServersOnStartup(false)
                .addIntents(Intent.MESSAGE_CONTENT)
                .login()
                .whenComplete((__, throwable) -> {
                    if(throwable != null)
                        System.out.println("Error starting bot!\n" + throwable.getMessage());
                    else
                        System.out.println("Bot is online!");
                })
                .join();

        this.commands.forEach(api::addMessageCreateListener);

        return api;
    }
}
