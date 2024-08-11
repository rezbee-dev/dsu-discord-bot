package com.dailystandups.dsudiscordbot.modules.sample;

import com.dailystandups.dsudiscordbot.http.Axios;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldCommand implements MessageCreateListener {

    private final Axios axios;

    @Autowired
    public HelloWorldCommand(Axios axios){
        this.axios = axios;
    }

    @Override
    public void onMessageCreate(MessageCreateEvent e){
        if(e.getMessageContent().equalsIgnoreCase("!hi")){
            e.getChannel().sendMessage("Testing endpoint: " + axios.get());
        }
    }
}
