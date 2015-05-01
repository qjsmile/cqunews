package cn.edu.cqu.news.utils.db;

import org.hibernate.HibernateException;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;




public class UpdateSql {
	public static void main(String[] args) throws HibernateException, ClassNotFoundException {

		SchemaUpdate se = new SchemaUpdate(new DBConfiguration());
		se.setDelimiter(";");
		//se.setOutputFile("生成的代码/SQL语句/"+"schema-update.sql");
		se.execute(true, false);
		
	}
}