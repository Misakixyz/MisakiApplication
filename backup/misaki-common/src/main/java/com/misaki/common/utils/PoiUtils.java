package com.misaki.common.utils;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;


public class PoiUtils {

	/**
	 * 生成Excel文件
	 * @param workbook
	 * @param fileName
	 * @return
	 */
	public static File createExcelFile(Workbook workbook, String fileName) {
		OutputStream stream = null;
		File file = null;
		try {
			file = File.createTempFile(fileName, ".xlsx");
			stream = new FileOutputStream(file.getAbsoluteFile());
			workbook.write(stream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			com.misaki.common.utils.IOUtils.closeQuietly(workbook);
			com.misaki.common.utils.IOUtils.closeQuietly(stream);
		}
		return file;
	}
}
