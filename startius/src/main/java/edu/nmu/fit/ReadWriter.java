package edu.nmu.fit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriter {
    private static final String FILE_NAME_TO_SAVE = "Result";
    private static final String FILE_NAME_TO_READ = "Input";
    private static final String EXTENSION = ".xlsx";
    private static final String SHEET_NAME = "names";
    private static final int ROW_NUM = 5;

    public void saveToFile(XSSFWorkbook workbook, String version) {
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME_TO_SAVE + version + EXTENSION);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saving Done");
    }

    public XSSFWorkbook readFromFile() throws IOException {
        String pathToFile = FILE_NAME_TO_READ + EXTENSION;
        FileInputStream excelFile = new FileInputStream(new File(pathToFile));
        XSSFWorkbook wb = new XSSFWorkbook(excelFile);
        return wb;
    }

    public List<String> getDataFromFile() throws IOException {
        XSSFWorkbook workbookFromFile = readFromFile();
        XSSFRow readingRow = workbookFromFile.getSheet(SHEET_NAME).getRow(ROW_NUM);
        List<String> namesFromFile = new ArrayList<>();
        for (int i = 0; i < readingRow.getLastCellNum(); i++) {
            namesFromFile.add(readingRow.getCell(i).getStringCellValue());
        }
        return namesFromFile;
    }

    public void pushDataToFile(List<String> data) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(SHEET_NAME);
        XSSFRow row = sheet.createRow(ROW_NUM);
        for (int i = 0; i < data.size(); i++) {
            row.createCell(i).setCellValue(data.get(i));
        }
        saveToFile(workbook, "0");
    }
}