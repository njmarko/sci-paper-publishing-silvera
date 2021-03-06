/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-21 19:49:12
*/

package com.silvera.SciPaperService.service.dependencies;

import org.springframework.stereotype.Service;
import com.silvera.SciPaperService.domain.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@Service
public class UserServiceClient {

    @Autowired
    private DiscoveryClient discoveryClient;

    private String getServiceURL(String serviceName){
        List<ServiceInstance> list = discoveryClient.getInstances(serviceName);
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }

    
    @HystrixCommand(fallbackMethod = "isLoggedIn_fallback")
    public java.lang.Boolean isLoggedIn(java.lang.String username) {
        
        
        String targetUri = getServiceURL("UserService");
        RestTemplate restTemplate = new RestTemplate();
        
        
        return restTemplate.getForObject(targetUri + "/isloggedin/{username}", java.lang.Boolean.class, username);
        
        
    }
    
    //
    // This is a fallback method if method 'isLoggedIn' fails!
    //
    public java.lang.Boolean isLoggedIn_fallback(java.lang.String username) {
        return false;
    }
    
    
    @HystrixCommand(fallbackMethod = "getName_fallback")
    public java.lang.String getName(java.lang.String username) {
        
        
        String targetUri = getServiceURL("UserService");
        RestTemplate restTemplate = new RestTemplate();
        
        
        return restTemplate.getForObject(targetUri + "/getname/{username}", java.lang.String.class, username);
        
        
    }
    
    //
    // This is a fallback method if method 'getName' fails!
    //
    public java.lang.String getName_fallback(java.lang.String username) {
        return "";
    }
    
    

}