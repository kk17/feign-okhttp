package io.github.kk17.feignokhttp

import groovy.transform.CompileStatic
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

/**
 * @author zhike.chen on 24/7/18
 */
@CompileStatic
@FeignClient(name='github', url = "https://api.github.com")
interface GitHubClient {
    @RequestMapping(method = RequestMethod.GET, value = "/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@RequestParam("owner") String owner, @RequestParam("repo") String repo)
}
