import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface IParking {

    //��ӡ���
    public void print();

    //��鳵λ��Ϊ�շ���false���ɹ�ͣ�뷵��true
    public boolean addCar(Integer carType);

}
