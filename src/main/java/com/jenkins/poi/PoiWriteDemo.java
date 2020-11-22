package com.jenkins.poi;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 袁强
 * @data 2020/11/2 10:50
 * @Description
 */
public class PoiWriteDemo {
    public  void writePoi() throws IOException
    {
        File xlsFile = new File("/webapp/excel/poi.xls");
        // 创建工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建工作表
        HSSFSheet sheet = workbook.createSheet("sheet1");

        for (int row = 0; row < 5; row++)
        {
            HSSFRow rows = sheet.createRow(row);
            for (int col = 0; col < 10; col++)
            {
                // 向工作表中添加数据
                rows.createCell(col).setCellValue("data" + row + col);
            }
        }

        FileOutputStream xlsStream = new FileOutputStream(xlsFile);
        workbook.write(xlsStream);
        workbook.close();
    }
}
