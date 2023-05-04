import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface IParking {

    //打印结果
    public void print();

    //检查车位，为空返回false，成功停入返回true
    public boolean addCar(Integer carType);

}
