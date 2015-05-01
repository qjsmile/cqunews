package cn.edu.cqu.news.utils.db;

import org.hibernate.HibernateException;
import org.hibernate.tool.hbm2ddl.SchemaExport;





public class ExportSql {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws HibernateException 
	 */
	public static void main(String[] args) throws HibernateException, ClassNotFoundException {

		SchemaExport se = new SchemaExport(new DBConfiguration());
		//se.drop(true, true);
		se.setDelimiter(";");
		//se.execute(script, export, justDrop, justCreate);
		//se.setOutputFile("src/schema-export2.sql");
		se.execute(true, false, false, true);

	}

}