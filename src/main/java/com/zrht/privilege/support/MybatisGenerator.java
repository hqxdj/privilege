package com.zrht.privilege.support;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MybatisGenerator {

    private static final DbType DB_TYPE = DbType.MYSQL;
    private static final String DB_DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_JDBC_URL = "jdbc:mysql://192.168.1.234:3306/ht_dev?characterEncoding=utf8";
    private static final String DB_USERNAME = "ht_dev";
    private static final String DB_PASSWORD = "htroot";

    private static final String GEN_PATH = new File("gen").getAbsolutePath();
    private static final String PACKAGE_NAME = "com.zrht.privilege";
    private static final String AUTHOR_NAME = "xdj";
    private static final String[] TABLE_PREFIXS = {""};
    private static final String[] TABLE_NAMES = {
            "bank","customer","fund","menu",
            "menu_privilege","privilege","product","role",
            "role_privilege","user","user_group","user_group_role",
            "user_role","user_u_group"
    };

    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();
        generator.setGlobalConfig(globalConfig());
        generator.setDataSource(dataSourceConfig());
        generator.setStrategy(strategyConfig());
        generator.setPackageInfo(packageConfig());
        generator.setCfg(injectionConfig());
        generator.setTemplate(new TemplateConfig().setXml(null));
        generator.execute();
    }

    private static InjectionConfig injectionConfig() {
        InjectionConfig injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("author", this.getConfig().getGlobalConfig().getAuthor());
                this.setMap(map);
            }
        };
        FileOutConfig fileOutConfig = new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return GEN_PATH + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        };
        injectionConfig.setFileOutConfigList(Collections.singletonList(fileOutConfig));
        return injectionConfig;
    }

    private static PackageConfig packageConfig() {
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(PACKAGE_NAME);
        packageConfig.setEntity("entity");
        packageConfig.setMapper("dao");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setController("controller");
        return packageConfig;
    }

    private static StrategyConfig strategyConfig() {
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setTablePrefix(TABLE_PREFIXS);
        strategyConfig.setInclude(TABLE_NAMES);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setEntityColumnConstant(true);
        strategyConfig.setEntityBuilderModel(true);
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setEntityTableFieldAnnotationEnable(true);
        return strategyConfig;
    }

    private static DataSourceConfig dataSourceConfig() {
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DB_TYPE);
        dataSourceConfig.setDriverName(DB_DRIVER_NAME);
        dataSourceConfig.setUsername(DB_USERNAME);
        dataSourceConfig.setPassword(DB_PASSWORD);
        dataSourceConfig.setUrl(DB_JDBC_URL);
        return dataSourceConfig;
    }

    private static GlobalConfig globalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(GEN_PATH + "/src/main/java");
        globalConfig.setAuthor(AUTHOR_NAME);
        globalConfig.setDateType(DateType.ONLY_DATE);
        globalConfig.setFileOverride(true);
        globalConfig.setActiveRecord(false);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(false);
        globalConfig.setBaseColumnList(false);
        globalConfig.setOpen(false);
        globalConfig.setMapperName("%sDao");
        globalConfig.setXmlName("%sMapper");
        globalConfig.setServiceName("%sService");
        globalConfig.setServiceImplName("%sServiceImpl");
        globalConfig.setControllerName("%sController");
        return globalConfig;
    }

}
