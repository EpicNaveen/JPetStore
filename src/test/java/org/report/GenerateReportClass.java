package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReportClass extends BaseClass {

	public static void toGenerate(String json) {
		
		File file =new File("target");
		
		Configuration con=new Configuration(file,"JpetShop");
		con.addClassifications("user", "NaveenKumar");
        con.addClassifications("platform", "Windows-phpoton Eclipse");
        
        List<String> li=new LinkedList<>();
        li.add(json);
        
        ReportBuilder r=new ReportBuilder(li,con);
        r.generateReports();
        
        
        
        
	}
	
}
