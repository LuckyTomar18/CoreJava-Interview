package com.rays.io.serializeDeserialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	
	public String name;
	public transient int id;
	
	public Employee() {
		
		
	}
	
	public Employee(String name, int id) {
		this.id = id;
		this.name = name;		
	}
	
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(id);
	}
	
	public void readExternal(ObjectInput input) throws ClassNotFoundException, IOException {
		
	name = (String)	input.readObject();
	id = input.readInt();
		
		
	}
	
	public String toString() {
		
		return name + " " + id;
	}

}
