/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmbackend;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author piymitta
 */
@Path("processing")
public class ProcessingOrder {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProcessingOrder
     */
    public ProcessingOrder() {
    }

    /**
     * Retrieves representation of an instance of rmbackend.ProcessingOrder
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ProcessingOrder
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Path("putdata")
    @Consumes("application/xml")
    public String putXml(String content) {
        System.out.println(content);
        return content;
    }
}
