package ml.knightcraft.events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class helloEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String message = e.getMessage().getContentRaw();
        String name = e.getAuthor().getName();
        if(message.equalsIgnoreCase("hello")){
            e.getChannel().sendMessage("vlad is unfixable, " + name).queue();
        }
    }
}
