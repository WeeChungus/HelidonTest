package com.example.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.example.example.controller.ExampleController;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import one.microstream.enterprise.cluster.nodelibrary.helidon.MicrostreamBeanProvider;

@ApplicationScoped
@ApplicationPath("/")
public class JaxRsActivator extends MicrostreamBeanProvider
{
	private Collection<Class<?>> getControllers()
	{
		return List.of(ExampleController.class);
	}

	@Override
	public Set<Class<?>> getClasses()
	{
		final var set = super.getClasses();
		set.addAll(this.getControllers());
		return set;
	}
}
