@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class AppConfig {
    private String domain;
    private String port;           // 主端口（TUIC）
    private String uuid;           // TUIC UUID
    private String hy2Version = "2.6.5";
    private String remarksPrefix = "";

    // 新增：Hysteria2 端口（port+1 或自定义）
    private String hy2Port;
}
