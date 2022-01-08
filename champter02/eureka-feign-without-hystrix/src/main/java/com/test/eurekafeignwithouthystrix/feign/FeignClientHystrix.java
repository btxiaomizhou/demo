package com.test.eurekafeignwithouthystrix.feign;
import com.test.configure.FeignConfigurationOne;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="xxxx",url="http://localhost:8002/",configuration = FeignConfigurationOne.class,fallback = MyHystrixClientFallback.class)
public interface FeignClientHystrix {
    @RequestMapping(method = RequestMethod.GET,value = "/ticket")
    public String ticket(@RequestParam("name")String name);
}
