import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

public class Xml {
    public static void main(String args[]) throws IOException {
        FileInputStream fis=new FileInputStream("//home/amit/M");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
       int sheets= workbook.getNumberOfSheets();
        for (int i=0;i<sheets;i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("neha")) {
                XSSFSheet sheet1 = workbook.getSheetAt(i);
                Iterator<Row> rows=sheet1.iterator();
               Row  firstrow= rows.next();
               Iterator<Cell> ce=firstrow.cellIterator();
               ce.next();
               int k=0;
               int coloumn=0;

               while (ce.hasNext()){
               Cell value=ce.next();
               if (value.getStringCellValue().equalsIgnoreCase("data3")){

                              coloumn=k;
               }
                   k++;
               }
                System.out.println(coloumn);
            }

        }
    }
}
