package apascualco.blog;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedList;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("usuario")
public class Usuario {

    @GET
    public Response getUsuarios() {
        List<String> usuarios = new LinkedList<String>();
        usuarios.add("Paco");
        usuarios.add("Antonio");
        usuarios.add("Luis");
        return Response.ok(usuarios).build();
    }

}
