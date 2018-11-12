package org.example.epubcheck.issue_859;

import java.net.URL;

import org.xml.sax.InputSource;

import com.thaiopensource.util.PropertyMapBuilder;
import com.thaiopensource.validate.SchemaReader;
import com.thaiopensource.validate.auto.AutoSchemaReader;
import com.thaiopensource.validate.auto.SchemaReaderFactorySchemaReceiverFactory;
import com.thaiopensource.validate.schematron.NewSaxonSchemaReaderFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static boolean main(String[] args) {
	try {
	    String schemaPath = "schema.sch";
	    URL schemaURL = App.class.getResource(schemaPath);
	    InputSource schemaSource = new InputSource(schemaURL.toString());
	    PropertyMapBuilder mapBuilder = new PropertyMapBuilder();
//	    mapBuilder.put(ValidateProperty.ERROR_HANDLER,
//		    new ErrorHandlerImpl());

	    SchemaReader schemaReader;

	    schemaReader = new AutoSchemaReader(
		    new SchemaReaderFactorySchemaReceiverFactory(new NewSaxonSchemaReaderFactory()));

	    schemaReader.createSchema(schemaSource, mapBuilder.toPropertyMap());
	    return true;
	} catch (Exception e) {
	    e.printStackTrace();
	    return false;
	}
    }
}
