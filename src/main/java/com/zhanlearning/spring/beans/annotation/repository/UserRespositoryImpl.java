package com.zhanlearning.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("userRespository")
public class UserRespositoryImpl implements UserRespository {

	public void save() {

		System.out.println("UserRespository save ...");
	}

}
