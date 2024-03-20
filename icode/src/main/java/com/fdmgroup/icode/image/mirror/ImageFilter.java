package com.fdmgroup.icode.image.mirror;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.util.ImageUtils;


@Service("mirror")
public class ImageFilter {
	
	private ImageUtils utils;

	public ImageFilter(ImageUtils utils) {
		super();
		this.utils = utils;
	}

	public void mirrorFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		BufferedImage mirroredImage = utils.getBufferedImage(imageInfo);
	
		// ******************** CODE BELOW ****************
		
		//Reading Image
		File file = new File("C:/Images");
		BufferedImage img = ImageIO.read(file);
		for (int y = 0; y < image.getHeight(); y++) {
			for (int x = 0; x < image.getWidth(); x++){
				//Retrieve pixel contents
				int pixel = img.getRGB(x, y);
				//Creating color object from pixel value
				Color color = new Color(pixel, true);
				//Getting RGB values
				int red = color.getRed();
				int green = color.getGreen();
				int blue = color.getBlue();
				//Mirror modification of RGB values
				int pixel = img.getRGB(x, -y);
				//Create new color object
				color = new Color(red, green, blue);

				img.setRGB(x, y, color.getRGB());
			}
		}

		file = new File("D:\Images");
		ImageIO.write(img, "jpg", file);
		System.out.println("Done...");
 
		// ******************** CODE ABOVE ******************
	
		utils.saveBufferedImage(mirroredImage, imageInfo.getSimpleName(), "mirror");
	}

}
