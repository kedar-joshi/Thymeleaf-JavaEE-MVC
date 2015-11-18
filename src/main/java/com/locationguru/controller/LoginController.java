package com.locationguru.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("login")
@Controller
public class LoginController
{
	@Inject
	Models models;

	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String viewLogin()
	{
		logger.error("Logging in ... ");

		models.put("company", "Acme Products");
		models.put("product", "JavaEE 8 Bootstrap");
		return "login";
	}
}
