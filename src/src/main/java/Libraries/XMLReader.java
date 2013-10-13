package Libraries;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader {

	String username, firstname, lastname,password, email;
	Element elements;
	private void XMLRead() {
		// TODO Auto-generated method stub
		
		//Point the file path to a object of File class
		File filepath = new File("App.xml");
		try {
			DocumentBuilder dBuilder =  DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = dBuilder.parse(filepath);
		    NodeList nodelist = doc.getElementsByTagName("CSUserdetails");
		    Node node = nodelist.item(0);
			elements = (Element) node;
		    System.out.println(elements.getElementsByTagName("Firstname").item(0).getTextContent());
		    
		    
		    
		    
		}
		
		catch (ParserConfigurationException | SAXException | IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public String username()
		{
			XMLRead();	
			username = elements.getElementsByTagName("Username").item(0).getTextContent();
			return username;
		}
		
		public String firstname()
		{
			XMLRead();
			firstname = elements.getElementsByTagName("Firstname").item(0).getTextContent();
			return firstname;
		}
		
		public String lastname()
		{
			XMLRead();
			lastname = elements.getElementsByTagName("Lastname").item(0).getTextContent();
			return lastname;
		}
		
		public String email()
		{
			XMLRead();
			email = elements.getElementsByTagName("Email").item(0).getTextContent();
			return email;
		}
		
		public String password()
		{
			XMLRead();
			password = elements.getElementsByTagName("Password").item(0).getTextContent();
			return password;
		}
	}


