import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SysConfig
 *
 * @author YangKai
 * @date 2021/6/25
 */
@Configuration
public class SysConfig {

    @Bean
    public SysUser sysUser() {
        return new SysUser("a", "b");
    }
}
