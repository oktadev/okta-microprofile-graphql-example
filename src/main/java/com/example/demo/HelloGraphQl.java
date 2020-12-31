package com.example.demo;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class HelloGraphQl {

    @Query("hello")
    public String sayHello() {
        return "Hello world!";
    }

}
