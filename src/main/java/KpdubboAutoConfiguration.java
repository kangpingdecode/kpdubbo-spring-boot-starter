import com.kangping.kpdubbo.client.InitialProxy;
import com.kangping.kpdubbo.server.InitialMediator;
import com.kangping.kpdubbo.server.RpcServerListener;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author kangping
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: KpdubboAutoConfiguration
 * @date 2020/7/5
 */
@Configuration
@EnableConfigurationProperties({KpdubboClientProperties.class,KpdubboServiceProperties.class})
public class KpdubboAutoConfiguration {

    @Bean
    public InitialProxy initialProxy(KpdubboClientProperties clientProperties) {
        InitialProxy initialProxy = new InitialProxy();
        initialProxy.setHost(clientProperties.getHost());
        initialProxy.setPort(clientProperties.getPort());
        return initialProxy;
    }

    @Bean
    public InitialMediator initialMediator() {
        return new InitialMediator();
    }

    @Bean
    public RpcServerListener rpcServerLisenter(KpdubboServiceProperties serviceProperties) {
        RpcServerListener rpcServerListener = new RpcServerListener();
        rpcServerListener.setPort(serviceProperties.getPort());
        return rpcServerListener;
    }


}
