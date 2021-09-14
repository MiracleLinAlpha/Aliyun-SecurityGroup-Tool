package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public class saveAsFileWriter {

	public static void saveAsFileWriter(String content , String path) {
    	String savefile = path;
	    FileWriter fwriter = null;


	    try {

			FileOutputStream bcpFileWriter = new FileOutputStream(path);
			OutputStreamWriter opsw = new OutputStreamWriter(bcpFileWriter, "GBK");

			opsw.append(content);
			opsw.flush();
			opsw.close();

//			bcpFileWriter.write(content.getBytes());
//			bcpFileWriter.close();



	    } catch (IOException ex) {
	    	ex.printStackTrace();
	    } finally {
		    System.out.println("文件保存至 " + savefile);
	    }
	}

}
