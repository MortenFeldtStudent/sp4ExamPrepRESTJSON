package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import generator.Generator;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("sample")
public class SampleResource {

    @Context
    private UriInfo context;
    private final Generator generator = new Generator();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates a new instance of SampleResource
     */
    public SampleResource() {
    }

    @GET
    @Path("/criteria")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPetsEventDate(@QueryParam("amount") int amount, @QueryParam("firstid") int firstId) {
        return Response.ok().entity(gson.toJson(generator.generate(amount, firstId))).build();
    }
}
