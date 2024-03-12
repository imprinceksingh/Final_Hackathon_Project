package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {
	public static XSSFWorkbook workbook = new XSSFWorkbook();
	public static XSSFSheet bikesheet = workbook.createSheet("BikeDetails");
	public static XSSFRow headerRow1 = bikesheet.createRow(0);


	public static XSSFSheet modelsheet = workbook.createSheet("PopularCarModels");
	public static XSSFRow headerRow4 = modelsheet.createRow(0);

	// Created a method to set the style of top row for Headings
	private static void setHeaderStyle(XSSFRow headerRow, int colIndex, String headerName) {
		CellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		Font font = workbook.createFont();
		font.setColor(IndexedColors.WHITE.getIndex());
		style.setFont(font);

		headerRow.createCell(colIndex).setCellValue(headerName);
		headerRow.getCell(colIndex).setCellStyle(style);
	}

	// This method will write all upcoming bike details in BikeDetails sheet
	public static void writeBikeDetails(LinkedHashMap<String, List<String>> bikeDetails, String filePath) {
		try {
			headerRow1 = bikesheet.getRow(0);

			setHeaderStyle(headerRow1, 0, "Bike Name");
			setHeaderStyle(headerRow1, 1, "Bike Price");
			setHeaderStyle(headerRow1, 2, "Launch Date");

			for(String e: bikeDetails.keySet()) {
				
			}
			
			
			int rowNum = 1;
			for (List<String> detailsList : bikeDetails.values()) {
				XSSFRow row = bikesheet.createRow(rowNum++);

				int cellNum = 0;
				for (String detail : detailsList) {
					XSSFCell cell = row.createCell(cellNum++);
					if (cellNum == 3) {
						String det = detail.substring(15, detail.length());
						cell.setCellValue(det);
					} else {
						cell.setCellValue(detail);
					}
				}
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow1.getLastCellNum(); i++) {
				bikesheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
				workbook.write(fileOut);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	// This method will write all car models in PopularCarModels sheet
	public static void writePopularCarModel(List<String> carModels, String filePath) {
		try {
			headerRow4 = modelsheet.getRow(0);

			setHeaderStyle(headerRow4, 0, "Popular Car Model");

			for (int i = 0; i < carModels.size(); i++) {
				XSSFRow row = modelsheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = modelsheet.createRow(i + 1);
				}

				// use cell index 0 to write in the first column
				row.createCell(0).setCellValue(carModels.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < headerRow4.getLastCellNum(); i++) {
				modelsheet.autoSizeColumn(i);
			}

			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
				workbook.write(fileOut);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// This method will write all popular car model details
	

}
