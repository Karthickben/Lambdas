package com.lambdas;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(value=Authors.class)
@Retention(RetentionPolicy.RUNTIME)

public @interface Author {
	 String author();
	 String methodName();

}
