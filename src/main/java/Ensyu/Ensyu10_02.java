package Ensyu;

//正規表現の課題課題２
//英数字の大文字だけを抜き出しましょう
//漢字とひらがな、カタカナなどの日本語だけを抜き出しましょう
//英数字以外を抜き出しましょう

import java.util.List;
import java.util.stream.Collectors;

public class Ensyu10_02 {
    public static void main(String[] args) {
        List<String> strList = List.of(
                "Ab1", "あいう", "カキク", "山田", "ABC12",
                "abcde", "12345", "さしす", "ABCDE", "あいうえお",
                "ナニヌ", "花火", "KLM", "pqrst", "1234",
                "おはよう", "たなか", "マミム", "XYZ", "ひらがな",
                "ねこ", "イヌ", "風", "Sun", "Earth",
                "星空", "山川", "School", "工場", "Tokyo"

        );
        System.out.println("元のリスト：" + strList + "\n");

        List<String> filterList1 = strList.stream()
                .filter(n -> n.matches("^[A-Z0-9]+$"))
                .collect(Collectors.toList());

        System.out.println("大文字の英数字のみ：" + filterList1);

        List<String> filterList2 = strList.stream()
                .filter(n -> n.matches("^[\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}]+$"))
                .collect(Collectors.toList());

        System.out.println("日本語のみ：" + filterList2);

    }
}
