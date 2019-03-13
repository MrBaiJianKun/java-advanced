package com.java.util;




import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

/**
 * 随机类程序
 * @白建坤
 * 2019.3.12
 */
public class RandomColor {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int buledom = random.nextInt(256);
        int grenrandom = random.nextInt(256);
        int redRandom = random.nextInt(256);
        System.out.println("R:" + redRandom + "G:" + grenrandom + "B:" + buledom);
        int x1 = random.nextInt(120);
        int y1 = random.nextInt(40);
        //开始用随机色值绘制图片
        //在图片缓冲区内生成对象，指定图片大小和类型
        BufferedImage bufferedImage = new BufferedImage(120, 40, BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑", Font.BOLD, 16);
        Color color = new Color(redRandom, grenrandom, buledom);
        ((java.awt.Graphics) g).setColor(color);
        //开始绘制矩形，充满图片缓冲区
        ((java.awt.Graphics) g).fillRect(0, 0, 120, 40);
        //选择颜色绘制文字
        g.setColor(Color.pink);
        g.drawString("验证码",x1,y1);
        //输出图片
        File file=new File("D:/code.jpg");
        //获取字节输出流
        OutputStream outputStream=new FileOutputStream(file);
        //将图片冲缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流

    }
}
