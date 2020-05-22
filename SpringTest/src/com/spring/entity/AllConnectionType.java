package com.spring.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component("connection")
public class AllConnectionType {

	private List<String> list;
	private Map<String,String> map;
	private String[] array;
	private Set<String> set;
	private Properties pers;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Properties getPers() {
		return pers;
	}
	public void setPers(Properties pers) {
		this.pers = pers;
	}
	@Override
	public String toString() {
		return "AllConnectionType [list=" + list + ", map=" + map + ", array=" + Arrays.toString(array) + ", set=" + set
				+ ", pers=" + pers + "]";
	}
	
	
	
}
