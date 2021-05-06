import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(PropertiesLoader.getDiscordToken());
        builder.buildAsync();
    }
}
