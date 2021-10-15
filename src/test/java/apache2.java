import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class apache2 {
    public static void main(String[] args) throws IOException {
        //throws io-exception is used for maintianing normal flow of the code incase any exception occurs--

        //to write data we use fileputputstream
        FileOutputStream fs = new FileOutputStream("C:\\seleniumprac\\excel\\demo.xlsx");

        //XSSFworkbook respresents the workbook interface;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("demo");

        //for making a table we r using for loop;
        for(int r=0;r<=7;r++){

            XSSFRow row = sheet.createRow(r);

            for(int q=0;q<5;q++){

                //writting data in the fields--
                row.createCell(q).setCellValue("pop");
            }
        }

        //for writing in the table
        workbook.write(fs);





    }
}
