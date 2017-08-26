package com.up72.busi.utils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by admin on 15-6-17.
 */
public class UploadFtp {


    private static FTPClient ftp;
    /**
     *
     * @param path 上传到ftp服务器哪个路径下
     * @param addr 地址
     * @param port 端口号
     * @param username 用户名
     * @param password 密码
     * @return
     * @throws Exception
     */
    private static boolean connect(String path,String addr,int port,String username,String password) throws Exception {
        boolean result = false;
        ftp = new FTPClient();
        int reply;
        ftp.connect(addr,port);
        ftp.login(username,password);
//        ftp.enterLocalActiveMode(); //主动模式
        ftp.enterLocalPassiveMode(); //被动模式
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE); //二进制
        ftp.setDataTimeout(60*1000); //六十秒，超时时间；
        reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)){
            ftp.disconnect();
            return result;
        }
        ftp.makeDirectory(path); //创建目录
        ftp.changeWorkingDirectory(path); //切换上传目录
        result = true;
        return result;
    }
    /**
     *
     * @param file 上传的文件或文件夹
     * @throws Exception
     */
    private static void upload(File file) throws Exception{
        try {
            if(file.isDirectory()){
                ftp.makeDirectory(file.getName());
                ftp.changeWorkingDirectory(file.getName());
                String[] files = file.list();
                for (int i = 0; i < files.length; i++) {
                    File file1 = new File(file.getPath()+"\\"+files[i] );
                    if(file1.isDirectory()){
                        upload(file1);
                        ftp.changeToParentDirectory();
                    }else{
                        storeFile(file1);
                    }
                }
            }else{
                storeFile(file);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception();
        }
    }

    private static void storeFile(File file) throws Exception{
        FileInputStream input = null;
        try {
            input = new FileInputStream(file);
            ftp.storeFile(file.getName(), input);
            input.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception();
        }finally {
            if(input != null){
                try {
                    input.close();
                } catch (Exception ioe) {
                }
            }
        }
    }

    /**
     *
     * @param path 上传到ftp服务器哪个路径下
     * @param addr 地址
     * @param port 端口号
     * @param username 用户名
     * @param password 密码
     * @param file 上传的文件或文件夹
     */
    public static void uploadFile(String path,String addr,int port,String username,String password,File file) throws Exception{
        try {
            if(connect(path,addr,port,username,password)){
                upload(file);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception();
        }finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (Exception ioe) {
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        File file = new File("E:\\product\\upcloud-busi\\trunk\\upcloud-busi-parent\\upcloud-busi-web\\src\\main\\webapp\\test");
//        UploadFtp.uploadFile("/home/www/upcloud-info-web/test","192.168.1.107",21,"root","up722006",file);
        UploadFtp.uploadFile("", "localhost", 21, "ftp", "111111", file);
        System.out.println("end");
    }
}
