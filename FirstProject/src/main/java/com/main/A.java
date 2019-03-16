package com.main;

import com.main.beans.BRequest;
import com.main.beans.BResponce;
import com.main.beans.Request;
import com.main.beans.Responce;

public class A {

	public Responce m1(Request req){
		BRequest breq=new BRequest();
		breq.setId(req.getId());
		breq.setName(req.getName());
		
		B b=new B();
		
		BResponce bres=b.m1(breq);
		Responce res=new Responce();
		res.setDesc(bres.getDesc());
		res.setStatus(bres.getStatus());
		return res;
		
		
	}

	}


