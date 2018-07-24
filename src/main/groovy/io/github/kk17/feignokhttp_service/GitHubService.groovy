package io.github.kk17.feignokhttp_service

import groovy.transform.CompileStatic
import io.github.kk17.feignokhttp.Contributor
import io.github.kk17.feignokhttp.GitHubClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author zhike.chen on 24/7/18
 */
@CompileStatic
@Service
class GitHubService {
    @Autowired
    GitHubClient gitHubClient

    List<Contributor>  contributors(String owner, String repo) {
        return gitHubClient.contributors('spring-cloud', 'spring-cloud-openfeign')
    }
}
