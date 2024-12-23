package xmlOperations;

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

public class XMLFile {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		
		
		File file = new File(".\\testData\\pipeline.xml");
		
		file.createNewFile();
		
		DocumentBuilderFactory dbf = null;
		
		DocumentBuilder db;
		
		Document doc;
		
		dbf = dbf.newInstance();
		
		db=dbf.newDocumentBuilder();
		doc=db.parse(file);
		
		Element ele = doc.getDocumentElement();
		
		//System.out.println(ele);
		
	NodeList nlist	=ele.getChildNodes();
	
	for(int i=0;i<nlist.getLength();i++)
	{

	Node node =	nlist.item(i);
	
	//System.out.println(node.getNodeType());
	
	//System.out.println(Node.ELEMENT_NODE);
	
	if(node.getNodeType()==Node.ELEMENT_NODE)
	{
		Element ele2 = (Element) node;
		
		System.out.println(ele2.getTagName());
		
		System.out.println(ele2.getTextContent());
	}

}
}
}