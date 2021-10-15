import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class apache {

    public static void main(String[] args) throws IOException {

        //file input stream is used to read the data
        FileInputStream fs = new FileInputStream("C:\\seleniumprac\\excel\\caldata.xlsx");

        //xxsfworbook is a class representing the workbook interface
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sh = wb.getSheet("Sheet1");

        //inorder to read number of rows;
        int row = sh.getLastRowNum();

        //inorder to read coluumn numbers;
       int cell =  sh.getRow(0).getLastCellNum();


        //printing numbers of columns and rows;
       System.out.println(row);
        System.out.println(cell);


    }

}
