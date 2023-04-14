package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("1")
public class DSC extends Collage
{
	@Override
	void fee()
	{
		System.out.println("110000");
	}
}