package Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        Message m = event.getMessage();
        String s = m.getContentRaw();
        if(s.equals("2c21PO")){
           event.getChannel().sendMessage("Response").queue();
        }
    }
}
