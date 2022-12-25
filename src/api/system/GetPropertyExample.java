package api.system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main  (String[] args) {

        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String javaVersion = System.getProperty("java.version");
        String javaHome = System.getProperty("java.home");

        System.out.println(osName + " " + userName + " " + userHome);
        System.out.println(javaHome + " " + javaVersion);

        // 모든 시스템 키와 value 출력
        Properties props = System.getProperties();
        Set keys = props.keySet();
        for (Object objKey: keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println(key + "  " + value);

        }
    }
}
