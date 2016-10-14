package com.little.util;

import org.apache.log4j.Logger;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageUtils {

    private static  final Logger log = Logger.getLogger(ImageUtils.class);
	
    /** 
     * 对图片进行放大 
     * @param originalImage 原始图片 
     * @param times 放大倍数 
     * @return 
     */
    public static BufferedImage  zoomInImage(BufferedImage  originalImage, Integer times){ 
        int width = originalImage.getWidth()*times; 
        int height = originalImage.getHeight()*times; 
        BufferedImage newImage = new BufferedImage(width,height,originalImage.getType()); 
        Graphics g = newImage.getGraphics(); 
        g.drawImage(originalImage, 0,0,width,height,null); 
        g.dispose(); 
        return newImage; 
    } 
    /** 
     * 对图片进行放大 
     * @param srcPath 原始图片路径(绝对路径) 
     * @param newPath 放大后图片路径（绝对路径） 
     * @param times 放大倍数 
     * @return 是否放大成功 
     */
    public static boolean zoomInImage(String srcPath,String newPath,Integer times){ 
        BufferedImage bufferedImage = null; 
        try { 
            File of = new File(srcPath); 
            if(of.canRead()){ 
                bufferedImage =  ImageIO.read(of); 
            } 
        } catch (IOException e) { 
            //TODO: 打印日志 
            return false; 
        } 
        if(bufferedImage != null){ 
            bufferedImage = zoomInImage(bufferedImage,times); 
            try { 
                //TODO: 这个保存路径需要配置下子好一点 
                ImageIO.write(bufferedImage, "JPG", new File(newPath)); //保存修改后的图像,全部保存为JPG格式 
            } catch (IOException e) { 
                // TODO 打印错误信息 
                return false; 
            } 
        } 
        return true; 
    } 
    /** 
     * 对图片进行缩小 
     * @param originalImage 原始图片 
     * @param times 缩小倍数 
     * @return 缩小后的Image 
     */
    public static BufferedImage  zoomOutImage(BufferedImage  originalImage, Integer times){ 
        int width = originalImage.getWidth()/times; 
        int height = originalImage.getHeight()/times; 
        BufferedImage newImage = new BufferedImage(width,height,originalImage.getType()); 
        Graphics g = newImage.getGraphics(); 
        g.drawImage(originalImage, 0,0,width,height,null); 
        g.dispose(); 
        return newImage; 
    } 
    public static BufferedImage  zoomOutImage(BufferedImage  originalImage, Integer width,Integer height){
    	int imgtype = 0;
    	try{
    		imgtype = originalImage.getType();
    	}catch(Exception e){
    		log.error("error", e);
    	}
    	if(imgtype == 0)imgtype = BufferedImage.TYPE_INT_ARGB;
        BufferedImage newImage = new BufferedImage(width,height,imgtype);
        Graphics g = newImage.getGraphics(); 
        g.drawImage(originalImage, 0,0,width,height,null); 
        g.dispose(); 
        return newImage; 
    }
    public static boolean saveWebImage(String url,String path, Integer width,Integer height){
        BufferedImage bufferedImage = null; 
        try { 
            //new一个URL对象   
            URL imgurl = new URL(url);  
            //打开链接   
            HttpURLConnection conn = (HttpURLConnection)imgurl.openConnection();  
            //设置请求方式为"GET"   
            conn.setRequestMethod("GET");  
            //超时响应时间为10秒   
            conn.setConnectTimeout(10 * 1000);  
            //通过输入流获取图片数据   
            InputStream inStream = conn.getInputStream();  
            //得到图片的二进制数据，以二进制封装得到数据，具有通用性   
              bufferedImage =  ImageIO.read(inStream); 
        } catch (IOException e) { 
        	log.error("error", e);
            return false; 
        } 
        if(bufferedImage != null){ 
            try { 
                bufferedImage = zoomOutImage(bufferedImage,width,height); 
                //TODO: 这个保存路径需要配置下子好一点 
                ImageIO.write(bufferedImage, "JPG", new File(path)); //保存修改后的图像,全部保存为JPG格式 
            } catch (IOException e) { 
                // TODO 打印错误信息 
                return false; 
            } 
        } 
        return true; 
    }
    /**
     * 取图像宽高等属性
     * @param url
     * @return
     */
    public static Map<String, Integer> readImageProp(String url){
    	//访问图片时访问本地地址
    	if(url.indexOf("userfiles/images") > -1){
    		url = url.substring(0, url.indexOf("//")) +  "//127.0.0.1" + url.substring(url.lastIndexOf(":"),url.length());
    	}
        BufferedImage bufferedImage = null;
        Map<String, Integer> result = new HashMap<String, Integer>();
    	result.put("Height", 0);
    	result.put("Width", 0);
        try { 
            //new一个URL对象   
            URL imgurl = new URL(url);  
            //打开链接   
            HttpURLConnection conn = (HttpURLConnection)imgurl.openConnection();  
            //设置请求方式为"GET"   
            conn.setRequestMethod("GET");  
            //超时响应时间为10秒   
            conn.setConnectTimeout(10 * 1000);  
            //通过输入流获取图片数据   
            InputStream inStream = conn.getInputStream();  
            //得到图片的二进制数据，以二进制封装得到数据，具有通用性   
              bufferedImage =  ImageIO.read(inStream); 
        } catch (IOException e) { 
            return result; 
        } 
        if(bufferedImage != null){
        	result.put("Height", bufferedImage.getHeight());
        	result.put("Width", bufferedImage.getWidth());
        } 
        return result; 
    }    /** 
     * 对图片进行缩小 
     * @param srcPath 源图片路径（绝对路径） 
     * @param newPath 新图片路径（绝对路径） 
     * @return 保存是否成功
     */
    public static boolean zoomOutImage(String srcPath,String newPath, Integer width,Integer height){
        BufferedImage newBufferedImage = null;
        try { 
            File of = new File(URLDecoder.decode(srcPath,"utf-8")); 
            if(of.canRead()){
            	BufferedImage bufferedImage = ImageIO.read(of);
            	newBufferedImage = new BufferedImage(bufferedImage.getWidth(),bufferedImage.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
                newBufferedImage.getGraphics().drawImage(ImageIO.read(of), 0, 0, null);
                newBufferedImage = zoomOutImage(newBufferedImage,width,height);
                ImageWriter imageWriter = ImageIO.getImageWritersByFormatName("jpeg").next();  
                ImageWriteParam iwp = imageWriter.getDefaultWriteParam();
                iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                iwp.setCompressionQuality(0.8F);
                File file = new File(newPath);   
                FileImageOutputStream fileImageOutput = new FileImageOutputStream(file);   
                imageWriter.setOutput(fileImageOutput);   
                IIOImage iio_image = new IIOImage(newBufferedImage, null, null);   
                imageWriter.write(null, iio_image, iwp);   
                imageWriter.dispose();
                return true;
            }
            return false;
        } catch (IOException e) {
        	log.error("error", e);
            return false; 
        }
//上面的代码在PNG图片保存时会失真，屏蔽是因为有部分JPG格式图片缩小后格式无法保存（zoomOutImage方法中无法获得bufferedImage）
//        try { 
//            File of = new File(URLDecoder.decode(srcPath,"utf-8")); 
//            if(of.canRead()){ 
//                bufferedImage =  ImageIO.read(of); 
//            } 
//        } catch (IOException e) { 
//            //TODO: 打印日志 
//            return false; 
//        } 
//        if(bufferedImage != null){
//            bufferedImage = zoomOutImage(bufferedImage,width,height); 
//            try { 
//                //TODO: 这个保存路径需要配置下子好一点 
//            	String extName = srcPath.toLowerCase().indexOf(".png")>0?"PNG":"JPG";
//                ImageIO.write(bufferedImage, extName, new File(newPath)); //保存修改后的图像,全部保存为JPG格式 
//            } catch (IOException e) {
//            	Log.error("error", e); 
//                return false; 
//            } 
//        } 
//        return true; 
    } 
    public static boolean zoomOutImage(String srcPath,String newPath,Integer times){ 
        BufferedImage bufferedImage = null; 
        try { 
            File of = new File(srcPath); 
            if(of.canRead()){ 
                bufferedImage =  ImageIO.read(of); 
            } 
        } catch (IOException e) { 
            //TODO: 打印日志 
            return false; 
        } 
        if(bufferedImage != null){ 
            bufferedImage = zoomOutImage(bufferedImage,times); 
            try { 
                //TODO: 这个保存路径需要配置下子好一点 
                ImageIO.write(bufferedImage, "JPG", new File(newPath)); //保存修改后的图像,全部保存为JPG格式 
            } catch (IOException e) { 
                // TODO 打印错误信息 
                return false; 
            } 
        } 
        return true; 
    } 
    
    /** 
	* 得到网页中图片的地址 
	*/ 
	public static List<String> getImgUrl(String htmlStr){ 
		String img=""; 
		Pattern p_image; 
		Matcher m_image; 
		List<String> pics = new ArrayList<String>(); 
	
		String regEx_img = "<img.*src=(.*?)[^>]*?>"; //图片链接地址 
		p_image = Pattern.compile(regEx_img,Pattern.CASE_INSENSITIVE); 
		m_image = p_image.matcher(htmlStr);
		while(m_image.find()){ 
			img = img + "," + m_image.group(); 
			Matcher m = Pattern.compile("src=\"?(.*?)(\"|>|\\s+)").matcher(img); //匹配src 
			while(m.find()){
				pics.add(m.group(1));
			} 
		} 
		return pics; 
	} 

	
    public static void main(String[] args) { 
        boolean testIn = zoomInImage("E:/11.jpg","E:\\in.jpg",4); 
        if(testIn){ 
            System.out.println("in ok"); 
        } 
        boolean testOut = zoomOutImage("E:/11.jpg","E:\\out.jpg",4); 
        if(testOut){ 
            System.out.println("out ok"); 
        } 
    } 

}
