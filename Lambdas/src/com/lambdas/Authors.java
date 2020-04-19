package com.lambdas;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.Authenticator.RequestorType;

@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {
	
	Author[] value();

}
