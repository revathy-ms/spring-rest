package com.controller.employee;

import java.util.ArrayList;


import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

public class EmployeeControllerTest {
	
	@InjectMocks
	EmployeeController employeeController;
	@InjectMocks
	EmpDetails empDetails;
	@InjectMocks
	RestEmployeeController restEmployeeController;
	@InjectMocks
	RestEmployeeDetails restEmployeeDetails;
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
	}
	@Mock
	EmployeeMain employeeMain;
	@Mock
	ObjectMapper mapper=new ObjectMapper();
	@Mock
	ModelMap model;
	
	
	@Test
	public void testGetAllEmployees() throws Exception{
		
		String jsonStringMockedResponse ="[{\"eid\":1001,\"ename\":\"Diya\",\"dept\":\"IT\",\"domain\":\"Communication\",\"pid\" : \"pid_100\"}," +
				"{\"eid\":1002,\"ename\":\"John\",\"dept\":\"Development\",\"domain\":\"Java\",\"pid\" : \"pid_2091\"}]";
		when(mapper.writeValueAsString(any(ArrayList.class))).thenReturn(jsonStringMockedResponse);
		ModelAndView modelAndView=employeeController.getAllEmployees();
        String jsonString= modelAndView.getModel().get("list").toString();
		System.out.println("\n"+"from getAllEmployees---> " + jsonString);
		
		assertNotNull(modelAndView);
		assertNotNull(jsonString);
		assertNotNull(modelAndView.getModel());
		
	}
	
	@Test
	public void testGetEmployeeData() throws Exception{
		int id=1001;
		ModelAndView data=empDetails.getEmployeeData(id, model);

        String jsonString= data.getModel().get("empmap").toString();
		System.out.println("\n"+"From getEmployeeData---> " + jsonString);
		
		assertNotNull(data);
		assertNotNull(jsonString);
		assertNotNull(data.getModel());
		
		
	}
	
	@Test
	public void testGetAllEmployeesRest() throws Exception{
		
		String jsonStringMockedResponse ="[{\"eid\":1001,\"ename\":\"Diya\",\"dept\":\"IT\",\"domain\":\"Communication\",\"pid\" : \"pid_100\"}," +
				"{\"eid\":1002,\"ename\":\"John\",\"dept\":\"Development\",\"domain\":\"Java\",\"pid\" : \"pid_2091\"}]";
		when(mapper.writeValueAsString(any(ArrayList.class))).thenReturn(jsonStringMockedResponse);
		
        String jsonString= restEmployeeController.getAllEmployeesRest();
		System.out.println("\n"+"from getAllEmployeesRest---> " + jsonString);
		assertNotNull(jsonStringMockedResponse);
		assertNotNull(jsonString);
		
		
	}
	
	@Test
	public void testGetEmployeeDataRest() throws Exception{
		int id=1002;
        String jsonString= restEmployeeDetails.getEmployeeDataRest(id);
		System.out.println("\n"+"from getEmployeeDataRest---> \n " + jsonString);
		assertNotNull(jsonString);
	}
	
}
