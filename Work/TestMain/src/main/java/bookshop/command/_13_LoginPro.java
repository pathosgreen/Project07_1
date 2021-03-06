package bookshop.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bookshop.dao.MemberDAO;
import bookshop.controller.CommandAction;

public class _13_LoginPro implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String passwd  = request.getParameter("passwd");

		MemberDAO manager = MemberDAO.getInstance();
		int check= manager.userCheck(id,passwd);
		
		request.setAttribute("id", id);
		request.setAttribute("check", check);
		return "/13_loginPro.jsp";
		
	}
	
}