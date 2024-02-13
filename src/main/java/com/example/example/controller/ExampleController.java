package com.example.example.controller;

import com.example.example.storage.MicroStream;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class ExampleController
{
	@GET
	public String root()
	{
		return "Data root, created @ " + MicroStream.root().getData();
	}
}
