package io.github.kk17.feignokhttp

import groovy.transform.CompileStatic
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import static org.junit.Assert.*

/**
 * @author zhike.chen on 24/7/18
 */
@SpringBootTest
@RunWith(SpringRunner)
@CompileStatic
class GitHubClientTest {
    @Autowired
    GitHubClient gitHubClient

    @Test
    void contributors() {
        def contributors = gitHubClient.contributors('spring-cloud', 'spring-cloud-openfeign')
        assertNotNull(contributors)
    }

}
