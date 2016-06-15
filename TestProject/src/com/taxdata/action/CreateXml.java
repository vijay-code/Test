package com.taxdata.action;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXml {
	
	
	
	public void createXml(String name,String address,String pan,String dob,String assesment,double income,double tds,double taxded)
	{

		 final Logger log = Logger.getLogger(CreateXml.class.getName());

		try {

			String xmlFilePath = "";
			
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();

		
			Element root = document.createElement("Personal_Inforamtion");
			document.appendChild(root);

		
			Element UserName = document.createElement("Name");
			UserName.appendChild(document.createTextNode(name));
			root.appendChild(UserName);
			
		
			Element Address = document.createElement("Address");
			Address.appendChild(document.createTextNode(address));
			
			root.appendChild(Address);

		
			Element Pan = document.createElement("Pan");
			Pan.appendChild(document.createTextNode(pan));
			
			root.appendChild(Pan);

		
			Element DOB = document.createElement("DOB");
			DOB.appendChild(document.createTextNode(dob));
	
			root.appendChild(DOB);

		
			Element assess = document.createElement("Assesmentyear");
			assess.appendChild(document.createTextNode(assesment));
			
			root.appendChild(assess);
			
			Element income1 = document.createElement("income");
			income1.appendChild(document.createTextNode(Double.toString(income)));
			
			root.appendChild(income1);
			
			Element tds1 = document.createElement("TDS");
			tds1.appendChild(document.createTextNode(Double.toString(tds)));
			
			root.appendChild(tds1);

			Element taxded1 = document.createElement("taxdeducted");
			taxded1.appendChild(document.createTextNode(Double.toString(taxded)));
			
			root.appendChild(taxded1);
			// create the xml file
			//transform the DOM Object to an XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File("D:\\xmlfile"+pan+ ".xml"));
			log.info("Now the execution has reached  Action Class-CreateXml");

			transformer.transform(domSource, streamResult);

			log.info("Done creating XML File!!!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	
		
		
	}

}
