package fr.atelechev.chess.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("fen2diagram")
public class Fen2Diagram {

	@GET
	@Produces({MediaType.TEXT_PLAIN, "image/png"})
	public Object getDiagram() {
		return "OK!";
	}
	
}