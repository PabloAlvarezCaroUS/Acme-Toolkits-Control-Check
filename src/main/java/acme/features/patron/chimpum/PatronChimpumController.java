package acme.features.patron.chimpum;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import acme.entities.chimpum.Chimpum;
import acme.framework.controllers.AbstractController;
import acme.roles.Patron;

@Controller
public class PatronChimpumController extends AbstractController<Patron, Chimpum>{
	
	// Internal state -------------------------------------------------------------------
	
	@Autowired
	protected PatronChimpumListService listService;
	
	@Autowired
	protected PatronChimpumShowService showService;
	
	@Autowired
	protected PatronChimpumCreateService createService;
	
	@Autowired
	protected PatronChimpumUpdateService updateService;
	
	@Autowired
	protected PatronChimpumDeleteService deleteService;
	
	// Constructors ---------------------------------------------------------------------
	
	@PostConstruct
	protected void initialise() {
		super.addCommand("list", this.listService);
		super.addCommand("create", this.createService);
		super.addCommand("update", this.updateService);
		super.addCommand("delete", this.deleteService);
		super.addCommand("show", this.showService);
	}
}
