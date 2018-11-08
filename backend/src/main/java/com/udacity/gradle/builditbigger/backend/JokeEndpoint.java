package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class JokeEndpoint {

//    /** A simple endpoint method that takes a name and says Hi back */
//    @ApiMethod(name = "sayHi")
//    public JokeBean sayHi(@Named("name") String name) {
//        JokeBean response = new JokeBean();
//        response.setData("Hi, " + name);
//
//        return response;
//    }



    @ApiMethod(name = "getJoke")
    public JokeBean getJoke(){
        JokeBean response=new JokeBean();
        return response;
    }

}
