package com.library.Library_Management_Controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.library.Library_Management.BooksDetails;
import com.library.service.SearchService;


@Controller
public class SearchController {
	
	@Autowired
	SearchService ss;
	
	@RequestMapping(value="/Search", method = RequestMethod.GET)
	public String getName() {
		return "SearchbyId";
	}

	@RequestMapping(value="/Search", method = RequestMethod.POST)
		public void search_book(HttpServletRequest request, HttpServletResponse response)
		{	
			BooksDetails book = new BooksDetails();
			String str= request.getParameter("str");
			String by = request.getParameter("by");
			
			ss.Search(str,by);
			
			System.out.println("abc"+by+str);
			
			/*SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			session= sessionfactory.openSession();
			session.beginTransaction();
			book= (BooksDetails) session.get(BooksDetails.class, book_ID);
			int book_id= book.getBook_ID();
			String book_name= book.getBook_name();
			String book_author= book.getBook_author();
			int price= book.getBook_price();
			ModelAndView mv= new ModelAndView();
			mv.setViewName("SearchByIdResultPage.jsp");
			mv.addObject("book_id",book_id);
			mv.addObject("book_name",book_name);
			mv.addObject("book_author", book_author);
			mv.addObject("book_price", price);	
			return mv;*/
		}
		
	}


