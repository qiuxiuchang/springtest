package com.spring.info;

import org.springframework.stereotype.Component;

@Component("schemainfo")
public class SchemaInfo {

	public void SchemaBefore() {
		System.out.println("���ǻ���Schema��ǰ��֪ͨ");
	}

	public void Schemaafter() {
		System.out.println("���ǻ���Schema�ĺ���֪ͨ");
	}
}
