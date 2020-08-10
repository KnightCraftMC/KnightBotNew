package ml.knightcraft;

import ml.knightcraft.commands.helpCommand;
import ml.knightcraft.events.helloEvent;
import ml.knightcraft.events.startupEvent;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class bot {
    public static void main(String args[]) throws Exception {
        // Main Instance & Startup
        JDA jda = new JDABuilder(AccountType.BOT).setToken("NzQxMjI0NzA3MjM1NTEyMzcx.Xy0dTQ.paP_eEfMKaoyWpR3nLW6w2EO1tY").build();
        jda.addEventListener(new startupEvent());
        jda.getPresence().setActivity(Activity.watching("KnightCraft"));


        // Event registration
        jda.addEventListener(new helloEvent());


        // Command registration
        jda.addEventListener(new helpCommand());



    }
}
