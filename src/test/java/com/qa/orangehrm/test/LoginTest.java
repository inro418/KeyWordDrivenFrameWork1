package com.qa.orangehrm.test;

import org.testng.annotations.Test;

import com.qa.orangehrm.keyword.engine.KeyWordEngine;

public class LoginTest {

	public KeyWordEngine keyWordEngine;
	
	@Test
	public void login_test(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");   
	}
}
