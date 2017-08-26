package com.up72.busi.utils.issue;

import java.io.*;

/**
 * 发布工具类
 */
public class IssueUtil {


    /**
     * 创建模板文件
     * @param filePath
     * @param fileContent
     */
    public static void creatTemplateFile(String filePath,String fileContent){
        File file = new File(filePath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
            BufferedWriter writer=new BufferedWriter(write);
            writer.write(fileContent);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
