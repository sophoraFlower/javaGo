package com.imooc.o2o.dao.split;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamicDataSourceHolder {
	
	private static Logger logger = LoggerFactory.getLogger(DynamicDataSourceHolder.class);
    private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static final String DB_MASTER = "master";
    public static final String DB_SLAVE = "slave";
    
    /**
     * 获取连接类型
     * @return
     */
    public static String getDbType() {
        String db = contextHolder.get();
        if (db == null) {
            db = DB_MASTER;
        }
        return db;
    }
    
    /**
     * 设置连接类型
     * @param str
     */
    public static void setDbType(String str) {
        logger.debug("使用的数据源是: " + str);
        contextHolder.set(str);
    }
    
    /**
     * 清理连接类型
     */
    public static void clearDBType(){
        contextHolder.remove();
    }

}
