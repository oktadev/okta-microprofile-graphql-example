package com.example.demo;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import javax.annotation.security.RolesAllowed;

@GraphQLApi
public class SurfController {
    @RolesAllowed("Everyone")
    @Query("surfReport")
    public SurfConditions getSurfReport(@Name("location") String location) {
        return SurfConditions.getRandom(location);
    }

}
