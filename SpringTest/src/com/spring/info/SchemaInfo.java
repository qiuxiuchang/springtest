package com.spring.info;

import org.springframework.stereotype.Component;

@Component("schemainfo")
public class SchemaInfo {

	public void SchemaBefore() {
		System.out.println("这是基于Schema的前置通知");
	}

	public void Schemaafter() {
		System.out.println("这是基于Schema的后置通知");
	}
}
