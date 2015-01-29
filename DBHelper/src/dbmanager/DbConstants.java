/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

/**
 *
 * @author admin
 */
public class DbConstants {
    
    /**
     * This Class holds constants related to data types 
     */
    public static final class dataType{
                public static final String _INTEGER=" INTEGER ";
		public static final String _BOOL=" BOOL ";
		public static final String _REAL=" REAL ";
		public static final String _DOUBLE=" DOUBLE ";
		public static final String _FLOAT=" FLOAT ";
		public static final String _CHAR=" CHAR ";
		public static final String _TEXT=" TEXT ";
		public static final String _VARCHAR=" VARCHAR ";
		public static final String _BLOB=" BLOB ";
		public static final String _NUMERIC=" NUMERIC ";
		public static final String _DATETIME=" DATETIME ";
                
                public static final String _INTEGER_STRICT=" INTEGER(strict) ";
                public static final String _REAL_STRICT=" REAL(strict) ";
                public static final String _TEXT_STRICT=" TEXT(strict) ";
                
                
        public static String[] arrDataType={_INTEGER,_BOOL,_REAL,_DOUBLE,_FLOAT,_CHAR,_TEXT,_VARCHAR,_BLOB,
                                            _NUMERIC,_DATETIME,_INTEGER_STRICT,_REAL_STRICT,_TEXT_STRICT};
    }
    
    /**
     * This Class holds constants related to Database properties 
     * Table Constraints https://db.apache.org/derby/docs/10.1/ref/rrefsqlj13590.html
     */
    public static final class dbConstarint{
        
        public static final String _PRIMARYKEY=" PRIMARY KEY ";
	public static final String _AUTOINCREMENT=" AUTOINCREMENT ";
	public static final String _UNIQUE=" UNIQUE ";
	public static final String _NOTNULL=" NOT NULL ";
        public static final String _FOREIGNKEY=" FOREIGN KEY ";
        public static final String _REFERENCES=" REFERENCES ";
        
    }
}
