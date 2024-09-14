package com.shivam.arrayprograms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportToExcel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of entries
        System.out.print("Enter the number of entries: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create a new workbook and a sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("User Data");
        // Create the header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Name");
        headerRow.createCell(1).setCellValue("Phone Number");
        headerRow.createCell(2).setCellValue("Address");

        // Input and write data to the Excel file
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            // Create a new row and populate it with the user's input
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(name);
            row.createCell(1).setCellValue(phoneNumber);
            row.createCell(2).setCellValue(address);
        }

        // Write the data to an Excel file
        try (FileOutputStream fileOut = new FileOutputStream("UserData.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Data successfully written to UserData.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Closing resources
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }}