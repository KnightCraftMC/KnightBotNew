package ml.knightcraft;

import ml.knightcraft.commands.helpCommand;
import ml.knightcraft.events.helloEvent;
import ml.knightcraft.events.startupEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class bot {
    public static void main(String[] arguments)
            throws LoginException, InterruptedException
    {
        JDA api = JDABuilder.createDefault("NzQxMjI0NzA3MjM1NTEyMzcx.Xy0dTQ.paP_eEfMKaoyWpR3nLW6w2EO1tY")
                .addEventListeners(new startupEvent())
                .addEventListeners(new helloEvent())
                .addEventListeners(new helpCommand())
                .build().awaitReady();
    }
}
