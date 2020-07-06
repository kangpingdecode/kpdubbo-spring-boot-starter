import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author kangping
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: KpdubboProperties
 * @date 2020/7/5
 */
@ConfigurationProperties(prefix = "kpdubbo.service")
public class KpdubboServiceProperties {

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
