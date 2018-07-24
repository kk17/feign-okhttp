package io.github.kk17.feignokhttp

import groovy.transform.CompileStatic
import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author zhike.chen on 24/7/18
 */
@CompileStatic
//@Configuration
class OkHttpConfig {
    @Bean
    OkHttpClient okHttpClient(){
        return new OkHttpClient()
    }
}
