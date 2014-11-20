package pcbuilder;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComponentFoundCheck extends HandleUserInfo {
	
	private boolean GPU;
	private boolean PSU;
	private boolean Motherboard;
	private boolean Processor;
	private boolean Memory;
	private boolean Harddisk;
	
	
	public void getUserInput(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		ArrayList<String> pclist = new ArrayList<String>();
		
		String[] mb = request.getParameterValues("PcBuilder");
		PrintWriter out = response.getWriter();
		
		for (int i=0; i <pclist.size();  i++);
		 if(mb == null) {
	    	  out.println("Motherboard is not selected");
		 }
		 
	     RequestDispatcher dispatcher =           
	    		  request.getRequestDispatcher("Products.jsp");    
         dispatcher.forward( request, response );
	}

	//public ArrayList<StringList> ValidateUserInput() {
//		return null;
	//}


}
