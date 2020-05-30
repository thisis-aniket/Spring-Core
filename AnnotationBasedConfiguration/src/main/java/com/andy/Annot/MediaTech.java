package com.andy.Annot;

import org.springframework.stereotype.Component;

@Component
public class MediaTech implements Processor {
	public void process() {
		System.out.println("with MediaTech");
	}

}
