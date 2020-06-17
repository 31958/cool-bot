package Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.regex.Pattern;

public class EdenEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        Message m = event.getMessage();
        String s = m.getContentRaw();
        if(event.getAuthor().isBot()){
            event.getChannel().sendMessage("Beep boop boop beep").queue();
        }
    }
}
