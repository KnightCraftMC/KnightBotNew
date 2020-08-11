package ml.knightcraft.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class helpCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        if (e.getMessage().getContentRaw().equalsIgnoreCase("*help")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("Command and Features help");
            eb.setDescription("Page 1");
            eb.setColor(Color.RED);
            eb.addField("Creator", "Hoptilic", true);
            eb.addField("Owner", "Vlady", true);
            eb.addBlankField(false);
            eb.addField("Help", "The menu that you are currently looking at", false);

            eb.addField("Page 2", "Next Page", false);
            eb.addField("This thing types slow", "Im on laptop", false);
            e.getChannel().sendMessage(eb.build()).queue(msg -> {
                msg.addReaction("➡️").queue();
            });
        }
    }
        public void onGuildMessageReactionAdd (GuildMessageReactionAddEvent event){
            System.out.println(event.getReactionEmote());
            TextChannel channel = event.getChannel();
            String message = event.getMessageId();
            if(event.getReactionEmote().getName().equals("➡️") &&
            !event.getMember().getUser().equals(event.getJDA().getSelfUser())) {
                System.out.println("yeet");
            }
    }
}
