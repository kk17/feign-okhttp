package io.github.kk17.feignokhttp_service

import groovy.transform.CompileStatic
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import static org.junit.Assert.assertNotNull

/**
 * @author zhike.chen on 24/7/18
 */
@SpringBootTest
@RunWith(SpringRunner)
@CompileStatic
class GitHubServiceTest {

    @Autowired
    GitHubService gitHubService

    @Test
    void contributors() {
        def contributors = gitHubService.contributors('spring-cloud', 'spring-cloud-openfeign')
        assertNotNull(contributors)
    }

}
