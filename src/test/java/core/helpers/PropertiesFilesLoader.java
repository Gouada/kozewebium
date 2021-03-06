package core.helpers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Level;

import core.MyLogger;
import static core.Constants.PROPERTIES_FILE_FOLDER;

public class PropertiesFilesLoader {
	
	private static String file_path;
	public static Properties properties;
	private static InputStream fileInput;
	public static PropertiesFilesLoader singleInstance;
	 
	 public synchronized static PropertiesFilesLoader getInstance()
	 {
		 if(singleInstance == null)
			 singleInstance = new PropertiesFilesLoader();
		 return singleInstance;
	 }
	 
		// this method load the properties-file
		public synchronized Properties loadPropertiesFile(String filename) {
			MyLogger.logger.setLevel(Level.DEBUG);
			try { // return the properties-file as InputStream
				if(!filename.equals(""))
					 file_path = "/" + PROPERTIES_FILE_FOLDER + "/" + filename;
				
				fileInput = getClass().getResourceAsStream(file_path);
				// fileInput =
				// Class.forName("PropertiesFilesLoader").getResourceAsStream(file_path);

				properties = new Properties();
				if (fileInput == null) {
					MyLogger.logger.error("properties-file " + file_path + "could not be loaded");
					throw new FileNotFoundException();
				} else {
					MyLogger.logger.info("succes loading properties-file " + file_path);
				}
				// loading properties-file
				properties.load(fileInput);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return properties;
		}

		// return a property by the key
		public String getPropertyByKey(String propertyKey) {
			Properties proP = null; // = loadPropertiesFile();

			MyLogger.logger.info("getting property with following key..." + propertyKey);
			if (properties == null) {
				MyLogger.logger.info("properties is null............");
			} else {
				MyLogger.logger.info(" found corresponding property " + proP.getProperty(propertyKey));
			}
			return properties.getProperty(propertyKey);
		}
}
