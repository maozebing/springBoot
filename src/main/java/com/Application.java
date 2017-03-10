package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.tanukisoftware.wrapper.WrapperListener;
import org.tanukisoftware.wrapper.WrapperManager;

@SpringBootApplication
@ServletComponentScan
public class Application implements WrapperListener {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
		WrapperManager.start(new Application(),args);
	}

	@Override
	public Integer start(String[] strings) {
		return null;
	}

	@Override
	public int stop(int i) {
		return 0;
	}

	@Override
	public void controlEvent(int i) {

	}
}
