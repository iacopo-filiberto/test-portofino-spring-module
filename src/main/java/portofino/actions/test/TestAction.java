package portofino.actions.test;

import com.manydesigns.portofino.persistence.Persistence;
import com.manydesigns.portofino.resourceactions.custom.CustomAction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

public class TestAction extends CustomAction {

    @Autowired
    Persistence persistence;

    @GET
    @Path("/")
    public Response testGet() {
        return Response.ok("Ciao!").build();
    }
}
