package br.com.caelum.maven;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;


@Resource
public class BemVindoController {
	
	private Result result;

	public BemVindoController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void bemVindo(){
		System.out.println("estou invocando VRaptor");
		result.use(Results.http()).body("<html>bem vindo!</html>");
	}
	

}
