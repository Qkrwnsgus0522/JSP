package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action2 {
	// 추상메서드
	abstract public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
