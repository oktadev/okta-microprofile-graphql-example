package com.example.demo;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 */
@GraphQLApi
@ApplicationScoped
public class HelloController {

    @Query("hello")
    public String sayHello() {
        return "Hello world!";
    }
}
