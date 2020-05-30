package com.andy.Annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	@Qualifier("mediaTech")
	Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Snapdragon cpu) {
		this.cpu = cpu;
	}

	void config() {
		System.out.println("Octa Core, 4GB RAM Samsung S7 ");
		cpu.process();
	}
}
