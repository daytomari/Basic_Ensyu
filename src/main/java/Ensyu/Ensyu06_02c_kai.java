package Ensyu;

import java.util.HashMap;
import java.util.Map;

public class Ensyu06_02c_kai {

    public static void main(String[] args) {
        Map<Integer, String> studentList = new HashMap<>();
        studentList.put(1, "佐藤");
        studentList.put(2, "五十嵐");
        studentList.put(3, "南");
        studentList.put(4, "田中");
        studentList.put(5, "佐々木");
        studentList.put(6, "渡辺");
        studentList.put(7, "山本");
        studentList.put(8, "大久保");
        studentList.put(9, "林");
        studentList.put(10, "加藤");

        System.out.println("元のリスト：　" + studentList);

        Map<Integer, String> filteredStudentList = new HashMap<>();
        for (Map.Entry<Integer, String> entry : studentList.entrySet()) {
            if (entry.getKey() % 2 != 0) {
                filteredStudentList.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("削除後のリスト：　" + filteredStudentList);
    }
}
