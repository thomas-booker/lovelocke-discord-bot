import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Component
public class PropertiesLoader {
    public static String getDiscordToken() throws IOException {
        return getPropertiesFile(URIs.LOVELOCKEBOT_PROPERTIES).getProperty("TOKEN");
    }

    public static Properties getPropertiesFile(String propertiesFileLocation) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(propertiesFileLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
