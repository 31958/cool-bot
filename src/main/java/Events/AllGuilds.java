package Events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;
import java.util.regex.Pattern;

public class AllGuilds extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        Message m = event.getMessage();
        String s = m.getContentRaw();
        if(Pattern.compile(Pattern.quote("/all guilds"), Pattern.CASE_INSENSITIVE).matcher(s).find()){
            event.getChannel().sendMessage("------------------------").queue();
            event.getJDA().getGuilds().forEach(guild -> {event.getChannel().sendMessage(guild.getName()).queue();});
            event.getChannel().sendMessage("------------------------").queue();
        }
    }
}
