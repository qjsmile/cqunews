package cn.edu.cqu.news.utils.db;

import java.io.File;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.SettingsFactory;


@SuppressWarnings("serial")
public class DBConfiguration extends Configuration {

	public DBConfiguration() throws ClassNotFoundException {
		super();

		setProperty("hibernate.connection.driver_class",
				"net.sourceforge.jtds.jdbc.Driver");
		setProperty("hibernate.connection.url",
				"jdbc:jtds:sqlserver://192.168.56.102:1433/HHYCollect");

		setProperty("hibernate.connection.username", "hhy");
		setProperty("hibernate.connection.password", "hhy");
		setProperty("hibernate.dialect",
				"org.hibernate.dialect.SQLServerDialect");
		/*setProperty("hibernate.connection.driver_class",
				"com.mysql.jdbc.Driver");
		setProperty("hibernate.connection.url",
				"jdbc:mysql://localhost/health?useUnicode=true&characterEncoding=UTF-8");

		setProperty("hibernate.connection.username", "root");
		setProperty("hibernate.connection.password", "root");
		setProperty("hibernate.dialect",
				"org.hibernate.dialect.MySQLDialect");*/
		String base = "cn/edu/cqu/news/domains";
		File dir = new File("src/main/java/" + base);
		addClass(base, dir);

		// this.addPackage("domains");
	}


	private void addClass(String base, File dir) throws ClassNotFoundException {
		File files[] = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				addClass(base + "/" + file.getName(), file);
			} else {
				if (file.getName().endsWith(".java")) {
					int pos=file.getName().indexOf(".java");
					String className=base.replaceAll("/", ".")+"."+file.getName().substring(0, pos);
					//className=className.replaceAll("/", ".");
					
					//System.out.println(className);
					@SuppressWarnings("rawtypes")
					Class clz = Class.forName(className);
					this.addAnnotatedClass(clz);
				}
			}
		}

	}

	public DBConfiguration(SettingsFactory settingsFactory) {
		super(settingsFactory);
	}

}