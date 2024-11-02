package hello;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class JavaSystemProperties {
    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        for (String key : envMap.keySet()) {
            log.info("prop {}={}", key, System.getProperty(String.valueOf(key)));
        }
        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
    }
}
