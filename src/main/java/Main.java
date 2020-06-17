import Events.AllGuilds;
import Events.EdenEvent;
import Events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;

import javax.security.auth.login.LoginException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDA jda = new JDABuilder("NzIyNTk3NzIxMjU2NjI0MjE5.Xul6xA.3B43G9Q5Shpz04cnmR3xdr4QLbQ").build();

        jda.addEventListener(new HelloEvent());
        //jda.addEventListener(new EdenEvent());
        jda.addEventListener(new AllGuilds());
    }
}
