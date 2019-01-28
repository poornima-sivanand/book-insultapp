package org.openshift;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import java.ws.rs.GET;
import java.ws.rs.Path;
import java.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class InsultResource {

    @GET()
    @Produces("application/json")
    public HashMap<String,String> getInsult() {
        HashMap<String,String> theInsult = new HashMap<String,String>();
        theInsult.put("insult", new InsultGenerator().generateInsult());
        return theInsult;
    }
}