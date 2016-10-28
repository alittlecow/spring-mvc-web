package com.px.test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengx
 * @date 2016/10/17
 */
public class Test {
    public static void main(String[] args) {
        String oldpath="E:\\Users\\pengx\\urls.txt";
        dome1(oldpath);
    }

    private static String print() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String file=sc.next();
        return file;
    }

    private static void dome1(String oldpath) {
        String inpath=print();
        File in=new File(oldpath);
        BufferedReader br=null;
        try {
            br=new BufferedReader(new InputStreamReader(new FileInputStream(in)));
            String read;
            while((read=br.readLine())!=null){

                String [] s=read.split("/");
                String name=s[s.length-1];
                String path=inpath+"/"+name;
                downFile(read,path);
                path="";
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            Test.close(br);
        }
    }
    public static void downFile(String url,String filePath){
        InputStream is=null;
        OutputStream os=null;
        try {
//			a）创建输入输出数据源
            URL inUrl=new URL(url);
            File outFile=new File(filePath);
//		    b）通过数据源创建输入输出流
            is=inUrl.openStream();
            os=new FileOutputStream(outFile);
//		    c）通过输入流循环的读取数据
            byte[] buff=new byte[512];
            int readLen;
            while ((readLen=is.read(buff))!=-1) {
//			    d）通过输出流循环的写出数据
                os.write(buff, 0, readLen);
            }
//		    e）刷新流flush（如果需要数据-立即传入到数据源时，则需要调用）
            os.flush();
            System.out.println("下载"+url+"完成");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
//		    f）关闭流close
            Test.close(os,is);
        }
    }


    public static void close( Closeable ...  clsObjs){
        //遍历出clsObjs数组的所有元素-分别进行关闭
        for (Closeable clsObj : clsObjs) {
            if(clsObj!=null){
                try {
                    clsObj.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("关闭了"+clsObj);
            }
        }
    }
}
