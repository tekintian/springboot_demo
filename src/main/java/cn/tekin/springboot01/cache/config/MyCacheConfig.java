package cn.tekin.springboot01.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 自定义缓存key生成器 myKeyGenerator
 *
 * @Author Tekin <tekintian@gmail.com>
 * @Create 2019-10-21 15:18
 */
@Configuration
public class MyCacheConfig {

    @Bean("myKeyGenerator")
    public KeyGenerator myKeyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                return method.getName() + Arrays.asList(objects).toString();
            }
        };
    }
}
