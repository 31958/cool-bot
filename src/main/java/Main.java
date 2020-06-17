import Events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDA jda = new JDABuilder("NzIyNTk3NzIxMjU2NjI0MjE5.XulZ6g.9k7CBE2DyD4YrMW0vaPiTL5zSdg").build();

        jda.addEventListener(new HelloEvent());
    }
}
