package de.dreamit.micro;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author llorenzen
 * @since 16.06.17
 */
@Path("/")
public class TheResource {

    @Inject
    private TheCache cache;

    @GET
    @Path("/{key}")
    public String example(@PathParam("key") String key) {
        return cache.getCachedExample(key);
    }

}
